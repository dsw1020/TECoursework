<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
    
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<title>Make a Reservation</title>
</head>
<div id="campgroundSites">

 <h2 id="siteInfo" style="align: left">${aPark.parkName} Park, ${aCampground.campgroundName} Campground Reservations</h2>
 
 <c:url var="findAvailableSites" value="findAvailableSites"/>
 <form action="${findAvailableSites}" method="GET">
 <div id="makeAReservation">
 <label for="lblArrivalDate" >Arrival Date (mm/dd/yyyy)</label>
 <input type="text" name="arrivalDate" id="lblArrivalDate"/>
 
 <label for="lblDepartureDate" >Departure Date (mm/dd/yyyy)</label>
 <input type="text" name="departureDate" id="lblDepartureDate"/>
 
 <input type="submit" value="Click to check availablilty"/>
 
 </form>
 
<c:set var="id4SiteTable" value="hideSiteTable"></c:set>
<c:if test="${not empty theSites}">
<c:set var="id4SiteTable" value="showSiteTable"></c:set>
</c:if>
 
<div id=${id4SiteTable}>
<c:url var="reserveSiteURL" value="reserveSite"></c:url>

<form action="${reserveSiteURL}"  method="POST">
 <table>
	 <th>Site #</th>
	 <th>Max Occupancy</th>
	 <th>Max RV Length</th>
	 <th>hasUtilities?</th>

 <c:forEach var="aSite" items="${theSites}">
     <input type="hidden" name="campgroundId" value="${aCampground.campgroundId}"></input>
	<tr>
	<td>    
		<input type="submit" value="${aSite.siteNumber}" name="selectedSite"/>
  	</td>
		<td>${aSite.maxOccupancy}</td>
 		<td>${aSite.maxRVLength}</td>
 		<td>${aSite.hasUtilities}</td>
 	</tr>
 </c:forEach>
 </table>
 <label for="lblResName" value="Name for Reservation">Name for Reservation: </label>
 <input name="reservationName" id="lblResName">
 <p> Enter Name for Reservation and Click Site # to Reserve Site</p>
 </form>
 </div>
 
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
</div>
