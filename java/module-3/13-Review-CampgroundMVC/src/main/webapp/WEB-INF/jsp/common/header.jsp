<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<title>Campground Reservation System</title>

	<c:url value="/css/site.css" var="cssURL" />
	<link rel="stylesheet" type="text/css" href="${cssURL}">

	<body class="mainContainer">

	<c:url value="img/logo.png" var="logoImg"/>
	<img src="${logoImg}" id="logo" />

	<h1 id="headerTitle">Campground Reservation System</h1>

