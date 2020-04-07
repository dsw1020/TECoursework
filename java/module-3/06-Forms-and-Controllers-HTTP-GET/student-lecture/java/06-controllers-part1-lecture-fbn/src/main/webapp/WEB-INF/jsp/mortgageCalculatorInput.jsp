<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="Mortgage Calculator" />
</c:import>

<h2>Mortgage Calculator</h2>

<!-- use a c:url to crate a properly formed url to send the form request to when form is submitted 						-->
<c:url var="formAction" value="/mortgageCalculatorResult" /> <!--  Use this URL path when the form is submitted 		-->

<!--  form is an html elelment to create a group of user fields to send pack to the application 						-->
<!--  method= indicates the type of HTTP request to use when the form is submitted 										-->
<!--  action= is the url to send the HTTP request to upon form submission 												-->

<form method="GET" action="${formAction}"> <!-- Issue a GET request to store the url stored in the variable formAction 	-->
	<div class="formInputGroup">
		<label for="loanAmount">Loan Amount:</label> 
		<input type="text" name="loanAmount" id="loanAmount" />
	</div>
	<div class="formInputGroup">
		<label for="loanTerm">Loan Term:</label> 
		<select name="loanTerm"	id="loanTerm">
			<option value="10">10 Years</option> <!-- value - what is returned when the user clicks it -->
			<option value="15">15 Years</option>
			<option value="30">30 Years</option>
		</select>
	</div>
	<div class="formInputGroup">
		<label for="rate">Interest Rate:</label> 
		<input type="text" name="rate" id="rate" />
	</div>
	<input class="formSubmitButton" type="submit" value="Calculate Payment" />
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />