<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<ol>														<!-- go to the requestMapand get the value for the key "nameList" -->
			<c:forEach var="anEntry" items="${requestScope.nameList}"> <!--  requestScope is the name for the requestMap -->
				<li>${anEntry}</li>
			</c:forEach>
		</ol>
	</body>
</html>