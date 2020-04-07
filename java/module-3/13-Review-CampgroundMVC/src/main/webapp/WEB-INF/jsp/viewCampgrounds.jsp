<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:set var="page to load " value="homepage"/>

<head>
<meta charset="UTF-8">
</head>
<div id="parkCampgrounds">

 <h2 id="parkInfo" style="align: left">${aPark.parkName} Park Campgrounds</h2>
 
 
  <c:set var="id4CampgroundInfo" value="hideCampgroundInfo"></c:set>
<c:if test="${not empty Campgrounds }">
<c:set var="id4CampgroundInfo" value="showCampgroundInfo"></c:set>
</c:if>

 <div id="${id4ParkInfo}">
 <h2 id="campgroundInfo" style="align: left">Campground Information</h2>
 
 <table>
 <thead>
	    <th>Name</th>
	    <th>Month Open</th>
	    <th>Month Close</th>
	    <th>Daily Fee</th>
	    </thead>
 <c:forEach var="aCampground" items="${campGrounds}">
     <input type="hidden" name="campgroundId" value="${aCampground.campgroundId}"></input>
	<tr>
	<td>    
		<c:url var="searchReservationsURL" value="searchReservations">
 				<c:param name="selectedCampground" value="${aCampground.campgroundId}"></c:param>
 			</c:url>
 			
 			<a href="${searchReservationsURL}">
   				 <div style="height:100%;width:100%">
    				 ${aCampground.campgroundName}
   			 </div>
  			</a>
		</td>
 		<fmt:parseDate value="${aCampground.dateOpen}" dateStyle="long" pattern="M" var="monthDate"></fmt:parseDate> 
        <td><fmt:formatDate value="${monthDate}" pattern="MMMM"></fmt:formatDate></td>
 		<fmt:parseDate value="${aCampground.dateClose}" dateStyle="long" pattern="M" var="monthDate"></fmt:parseDate> 
        <td><fmt:formatDate value="${monthDate}" pattern="MMMM"></fmt:formatDate></td>
 		<td>${aCampground.dailyFee}</td>
 	</tr>
 </c:forEach>
 </table>
<p> Click Campground Name to Make a Reservation</p>
</div>
 <c:import url="/WEB-INF/jsp/common/footer.jsp" />
 </div>
</html>

