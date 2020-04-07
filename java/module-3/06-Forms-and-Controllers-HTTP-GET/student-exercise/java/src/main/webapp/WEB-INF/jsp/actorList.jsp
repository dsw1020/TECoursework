<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
<c:set var="pageTitle" value="All Actors List"/>
</c:import>

<h2>Actor Search</h2>

<c:url var="formAction" value="/actorSearchResult"/>

<form method="GET" action="${formAction}">
	<div class

<!-- Form goes here -->
<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
    <!-- What do we print here for each actor? -->
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>