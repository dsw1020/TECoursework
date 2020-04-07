package com.techelevator.authentication;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import com.techelevator.model.User;
import com.techelevator.model.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/************************************************************************************
 * Some background information:
 * 
 * A Java Bean is a POJO. (i.e. A Java class that follows the standard for beans)
 * 
 * A Spring bean is an object that is instantiated, assembled, and otherwise 
 * managed by a Spring IoC container.
 * 
 * A Spring IoC Container is used to managing the complete life cycle 
 * of a Spring bean from creation to its destruction. 
 * 
 * It uses Dependency Injection (DI) to manage components and 
 * Spring bean objects.
 * 
 * Configuration metadata which represent Java code, annotations 
 * or XML along with Java POJO classes are used by a Spring IoC Container
 * 
 ************************************************************************************/
/************************************************************************************
 * A bean can be session scoped allowing sharing of the bean and it's information
 * (i.e. instantiated once per session and reused 
 *       rather than instantiated when called and discarded)
 *       
 * The @Scope(value="session".....) annotation is used to give a bean session scope
 ************************************************************************************/

/**
 * SessionAuthProvider
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS) // Automatically instantiate this when a session starts
public class SessionAuthProvider implements AuthProvider {

    public static final String USER_KEY = "appCurrentUser";

    private HttpSession session;  					// Define a session map to use for this class - shared by all users of the class
    private UserDao dao;		 				 	// Define the DAO for access to the user tables

    
    @Autowired 					  									// Spring MVC will automatically inject the data source from the springmvc-servlet.xml file
    public SessionAuthProvider(HttpSession session, UserDao dao) { 	// ctor for the class expecting a session map and dao
        this.session = session;										// assign the session map passed to the class session map
        this.dao = dao;												// assign the dao passed to the class dao
    }

    @Override
    public boolean isLoggedIn() {						// if entry in the session map is null - user is not logged in. 
        return session.getAttribute(USER_KEY) != null;  // get from "appCurrentUser" from the session map, check to see if it's null 
    }

    @Override
    public User getCurrentUser() {
        return (User) session.getAttribute(USER_KEY);  // return the User object from the Session map
    }

    @Override
    public boolean signIn(String username, String password) {
        User authenticatedUser = dao.getValidUserWithPassword(username, password);
        if (authenticatedUser != null) {		// if username and password are good... the user is authenticated
            session.setAttribute(USER_KEY, authenticatedUser); // if user is authenticated - put user object with USER_key in session map
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logOff() {
        session.removeAttribute(USER_KEY);
        session.invalidate();
    }

    @Override
    public boolean changePassword(String existingPassword, String newPassword) {
        User userFromSession = (User) session.getAttribute(USER_KEY);
        if (userFromSession == null) {
            return false;
        }
        User userFromDb = dao.getValidUserWithPassword(userFromSession.getUsername(), existingPassword);
        if (userFromDb != null && userFromDb.getId() == userFromDb.getId()) {
            dao.changePassword(userFromSession, newPassword);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void register(String username, String password, String role) {
        dao.saveUser(username, password, role);
    }

    @Override
    public boolean userHasRole(String[] roles) {
        User currentUser = getCurrentUser(); 			// Get the current user from session map or null if not logged in 
        if (currentUser != null && roles != null) {		// if the user is logged in and the roles String is not empty...
            return Arrays.asList(roles).contains(currentUser.getRole()); // return whether the roles passed in is the role of the current user
        } else {
            return false; // if user is not logged in or the roles String is empty
        }
    }
}