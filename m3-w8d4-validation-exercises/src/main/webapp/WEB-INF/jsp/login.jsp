<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> <!-- This import is what makes the "form:form" work-->

<c:set var="pageTitle" value="Login"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>


<c:url var="loginUrl" value="/login"/>
<form:form action="${loginUrl}" method="POST" modelAttribute="login">

	
		<div class="form-group">
		<label for="email" >Email:</label>
		<form:input path="email" class="Form-control"/>
	
	</div>
	
		<div class="form-group">
		<label for="password" >Password:</label>
		<form:password path="password" class="Form-control"/>
		<form:errors path="password" cssClass="error"/>
			
	</div>
	
	
	<input type="submit" value="Login" class="btn btn-default">
	
	

</form:form>

<%@include file="common/footer.jspf" %>
