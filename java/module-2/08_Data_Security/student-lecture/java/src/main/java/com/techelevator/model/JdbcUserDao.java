package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.security.PasswordHasher;

public class JdbcUserDao implements UserDao {

    private JdbcTemplate jdbcTemplate;
    private PasswordHasher passwordHasher;

    /**
     * Create a new user dao with the supplied data source and the password hasher
     * that will salt and hash all the passwords for users.
     *
     * @param dataSource an SQL data source
     * @param passwordHasher an object to salt and hash passwords
     */
    public JdbcUserDao(DataSource dataSource, PasswordHasher passwordHasher) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.passwordHasher = passwordHasher;
    }

    /**
     * Save a new user to the database. The password that is passed in will be
     * salted and hashed before being saved. The original password is never
     * stored in the system. We will never have any idea what it is!
     *
     * @param userName the user name to give the new user
     * @param password the user's password
     * @return the new user
     */
    @Override
    public User saveUser(String userName, String password) {
        byte[] salt = passwordHasher.generateRandomSalt();			// get a random value for the salt
        
        String hashedPassword = passwordHasher.computeHash(password, salt);	// Use the computeHash method
        																	// with the test password and salt
        																	// to generate the encrypted password
        String saltString = new String(Base64.encode(salt));				// Convert the salt from generic byte array
        																	// to a String for storage
       
        long newId = jdbcTemplate.queryForObject(		// newId will have the value generated by the Inser					
        																	
        																	
                "INSERT INTO users(username, password, salt) VALUES (?, ?, ?) RETURNING id", Long.class, userName,
                hashedPassword, saltString);

        User newUser = new User();
        newUser.setId(newId); 			// Use the generated id for the User object we are returning
        newUser.setUsername(userName);

        return newUser;
    }

    /**
     * Look for a user with the given username and password. Since we don't
     * know the password, we will have to get the user's salt from the database,
     * hash the password, and compare that against the hash in the database.
     *
     * @param userName the user name of the user we are checking
     * @param password the password of the user we are checking
     * @return true if the user is found and their password matches
     */
    @Override
    public boolean isUsernameAndPasswordValid(String userName, String password) {
        String sqlSearchForUser = "SELECT * FROM users WHERE UPPER(username) = '" + userName.toUpperCase() + "'";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchForUser);
        if (results.next()) {
            String storedSalt = results.getString("salt");
            String storedPassword = results.getString("password");
            String hashedPassword = passwordHasher.computeHash(password, Base64.decode(storedSalt));
            return storedPassword.equals(hashedPassword);
        } else {
            return false;
        }
    }

    /**
     * Get all of the users from the database.
     * @return a List of user objects
     */
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        String sqlSelectAllUsers = "SELECT id, username FROM users";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllUsers);

        while (results.next()) {
            User user = new User();
            user.setId(results.getLong("id"));
            user.setUsername(results.getString("username"));
            users.add(user);
        }

        return users;
    }

}
