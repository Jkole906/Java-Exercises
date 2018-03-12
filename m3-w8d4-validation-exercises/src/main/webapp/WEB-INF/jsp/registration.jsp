<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> <!-- This import is what makes the "form:form" work-->

<c:set var="pageTitle" value="Registration"/>
<%@include file="common/header.jspf" %>

<h2>Registration</h2>


<c:url var="registrationUrl" value="/register"/>
<form:form action="${registrationUrl}" method="POST" modelAttribute="registration">

	<div class="form-group">
		<label for="firstName">First Name:</label>
		<form:input path="firstName" class="Form-control"/>
		<form:errors path="firstName" cssClass="error"/>
	
	</div>
	
		<div class="form-group">
		<label for="lastName" >LastName:</label>
		<form:input path="lastName" class="Form-control"/>
				<form:errors path="lastName" cssClass="error"/>
	
	</div>
	
		<div class="form-group">
		<label for="email" >Email:</label>
		<form:input path="email" class="Form-control" placeholder="example@address.com"/>
				<form:errors path="email" cssClass="error"/>
	
	</div>
	
		<div class="form-group">
		<label for="confirmEmail" >Confirm Email</label>
		<form:input path="confirmEmail" class="Form-control"/>
				<form:errors path="confirmEmail" cssClass="error"/>
	
	</div>
	
		<div class="form-group">
		<label for="password" >Password:</label>
		<form:password path="password" class="Form-control" placeholder="Minimum 5 Characters"/>
		<form:errors path="password" cssClass="error"/>
		
	
	</div>
	
		<div class="form-group">
		<label for="confirmPassword" >Confirm Password:</label>
		<form:password path="confirmPassword" class="Form-control"/>
				<form:errors path="confirmPassword" cssClass="error"/>
	
	</div>
	
		<div class="form-group">
		<label for="birthDate" >Date of Birth:</label>
		<form:input path="birthDate" class="Form-control" placeholder="YYYY-MM-DD"/>
	
	</div>
	
		<div class="form-group">
		<label for="numOfTickets" >Number of Tickets:</label>
		<form:input path="numOfTickets" class="Form-control" value="1"/>
				<form:errors path="numOfTickets" cssClass="error"/>
	
	</div>
	
	
	<input type="submit" value="Register" class="btn btn-default">
	
	

</form:form>

<%@include file="common/footer.jspf" %>
