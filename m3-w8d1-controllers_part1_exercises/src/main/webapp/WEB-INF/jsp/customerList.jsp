<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Customers List" />

<%@include file="common/header.jspf"%>



<c:url value="/customerSearch" var="formAction" />
<form method="GET" action="${formAction }">
	<label for="search"></label> <input type="text" id="search"
		name="search" placeholder="Search" /> <select id="sort" name="sort"
		placeholder="Select One">
		<option value="last_name">Last Name</option>
		<option value="email">Email</option>
		<option value="active">Active</option>
	</select> <input type="submit" value="Search" />
</form>

<table class="table">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Active</th>
	</tr>
	<c:forEach items="${customer}" var="customer">
		<tr>
			<td><c:out value="${customer.firstName}" /> <c:out
					value="${customer.lastName}" /></td>
			<td><c:out value="${customer.email}" /></td>
			<td><c:out value="${customer.active ? 'Yes' : 'No' }" /></td>
		</tr>
	</c:forEach>
</table>




<%@include file="common/footer.jspf"%>