<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here to accept the user input  -->
<!-- input - input field                      -->
<!-- type="text"   - single line text field     -->
<!-- type="submit" - submit form when this is clicked - Send teh HTTP request to the URL in action= -->
<!-- name=""       - name of variable used in this jsp and controller  -->
<!-- value=""      - initial value in field when it's displayed        -->
<!-- id=""         - used in the jsp to identify this field            -->

<!-- <form> create a user interaction form -->
<!-- method="" send this HTTP request when the form is submitted - GET / POST -->
<!-- action="" url to send the HTTP request to when the form is submitted - this should match a path in a controller -->
<c:url var="whateverVinnySaid" value="/goFindTheActors"></c:url>

<form method="GET" action="${whateverVinnySaid} ">   <!-- when a GET is done any form variables are placed in teh query string -->

<label for="lblSearch">Name to look for</label> 
<input type="text" name="lastNameWeWant" value="enter last name" id="lblSearch">
<input type="submit" value="Press This to Search">

</form>

<!--  Display the results of the search -->
<table class="table">
<tr>
<th>Name</th>
</tr>
<!-- Expect results to be display in actors collection (use a forEach) -->
<c:forEach items="${actors}" var="anActorObject">
<tr>
   <td>
   <c:out value="${anActorObject.firstName}   ${anActorObject.lastName }"></c:out>
   </td>
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>