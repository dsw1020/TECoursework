<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Adult</th>
			</tr>
			<!-- 							requestScope. is optional; it is assumed  -->
			<c:forEach var="person" items="${personList}"> <!-- specify the request map key -->
				<tr>
					<td>${person.firstName}</td> <!--  use the forEach-variable.member-name to access data in the object -->
					<td>${person.lastName}</td> <!--  the standard name getter is used to retieve the value -->
					<td>${person.age}</td>
					<td>${person.adult}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>