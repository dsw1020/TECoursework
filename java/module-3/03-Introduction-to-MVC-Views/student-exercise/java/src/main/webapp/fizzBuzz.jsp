<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="FizzBuzz"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out value="${ numberOfItems }" /></a></li>
	</ul>
</nav>


<ul id="fizzbuzz">
	<c:forEach begin="1" end="${ param.number }" var="count">  
		<c:choose>
			<c:when test="${count % 3 == 0 && count % 5 == 0}">
				<c:set var="rowClassAttribute" value="fizzbuzz" />
				<c:set var="output" value="FizzBuzz" />
			</c:when>
			<c:when test="${count % 3 == 0}">
				<c:set var="rowClassAttribute" value="fizz" />
				<c:set var="output" value="Fizz" />
			</c:when>
			<c:when test="${count % 5 == 0}">
				<c:set var="rowClassAttribute" value="buzz" />
				<c:set var="output" value="Buzz" />
			</c:when>
			<c:otherwise>
				<c:set var="output" value="${count}"/>
				<c:set var="rowClassAttribute" value=""/>
			</c:otherwise>
			</c:choose>
	<li class= "${rowClassAttribute}"> ${output } </li>
	</c:forEach>
</ul>

<c:import url="common/footer.jsp"></c:import>