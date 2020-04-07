<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<c:set var="page to load " value="homepage"/>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  <link rel="stylesheet" href="stylesheet.css" type="text/css">
  </head>
 <p>Select a National Park from this list</p>
 
 
 <c:url var="submitAction" value="/parkInfo"></c:url>
 
 <form action="${submitAction}" method="GET">
 
	<select name="selectedPark" id="parksMenu">
		<c:forEach var="aPark" items="${allParks}"> <!-- Go through the List from the Map on element at a time -->
			<option value="${aPark.parkId}">${aPark.parkName}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Click here to see Park Info">
 </form>

 <c:set var="id4ParkInfo" value="hideParkInfo"></c:set>
<c:if test="${not empty aPark }">
<c:set var="id4ParkInfo" value="showParkInfo"></c:set>
</c:if>

 <div id="${id4ParkInfo}">
 <h2 id="parkInfo" style="align: left">Park Information</h2>
 
 <table>
 	<tr>
 		<td>Park Name:</td>
 	  	<td>${aPark.parkName}</td>
 	</tr>
 	<tr>
 		<td>Location:</td>
 		<td>${aPark.parkLocation }</td>
 	</tr>
 		<td>  Established:</td>
 		<td>${aPark.establishedDate}</td>
 	<tr>
 		<td>Area:</td>
 		<td> ${aPark.parkArea }</td>
 	</tr>
 	<tr>
 		<td>Visitor Count:</td>
 		<td>${aPark.visitorCount }</td>
    </tr>
 </table>
  <p>${aPark.parkDescription}</p> 
  
  <div class="optionList">
  <h3 class="prompt">Wattayawanndo?</h3>
  <table class="choices">
  	<tr>
 		<td>
 			<c:url var="viewCampgroundsURL" value="viewCampgrounds">
 				<c:param name="selectedPark" value="${aPark.parkId}"></c:param>
 			</c:url>
 			
 			<a href="${viewCampgroundsURL}">
   				 <div style="height:100%;width:100%">
    				 View Campgrounds
   			 </div>
  			</a>
		</td>
 	</tr>
 	<tr>
 	 	<td>
 			<a href="searchReservation">
   				 <div style="height:100%;width:100%">
    				 Search for a Reservation
   			 </div>
  			</a>
		</td>
 	 </tr>
 	</tr>
  </table>
  </div>
 
  
</div>
 
 
 <c:import url="/WEB-INF/jsp/common/footer.jsp" />
</html>