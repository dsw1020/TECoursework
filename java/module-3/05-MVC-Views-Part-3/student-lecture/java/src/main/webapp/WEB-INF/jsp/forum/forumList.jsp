<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
    <c:param name="pageTitle" value="The Solar System Geek Forum" />
</c:import>

<ul>
	<!-- Loop through each item in topicList from the request Map -->
	
	<c:forEach var="topic" items="${topicList}">  <!--  topicList is an entry in a request Map -->
		<c:url var="forumPostHref" value="/forum/forumDetail"> <!--  Generate a proper/correct URL  Assign to the variable forumPostHref-->
			<c:param name="forumId">${topic.id}</c:param> 	   <!-- Add a parameter called forumId with the value of the topic.id  		-->
		</c:url>
		<li><a href="${forumPostHref}">${topic.title}</a></li> <!--  topic.title reference the title value in current element 			-->
	</c:forEach>
</ul>

<c:import url="/WEB-INF/jsp/footer.jsp" />