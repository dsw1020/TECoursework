<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Fibonacci"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>
	</ul>
</nav>

<ul id="fibonacci">
			<c:set var="count" value="${param.max}"></c:set>
			<c:if test="${empty count}">
				<c:set var="count" value=""></c:set>
			</c:if>
			<c:set var="previous" value="0" />
			<c:set var="next" value="1" />
			<c:forEach begin="1" end="${param.max}" var="index">
				<c:set var="currentSum" value="${previous + next}" />
			<c:if test="${currentSum < param.max && currentSum > 0 }">
				<li>${currentSum}</li>
			</c:if>
				<c:set var="previous" value="${next}" />
				<c:set var="next" value="${currentSum}" />
			</c:forEach>
			
		</ul>


<c:import url="common/footer.jsp"></c:import>