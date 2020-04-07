<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="${puppy.name}!!!" />

<%@include file="common/header.jspf"%>

<h1>${puppy.name} <small>${puppy.gender}</small></h1>

<p>${puppy.name} is a wonderful dog who weighs ${puppy.weight} lbs and is ${puppy.paperTrained ? '' : ' NOT '} paper trained.</p>

<%@include file="common/footer.jspf"%>