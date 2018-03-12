<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>
<!-- Form goes here -->


<c:url value="/actorList" var="formAction" />
<form method="GET" action="${formAction}">
	<input type="text" id="userInputtedName" name="nameSearch"
		placeholder="Search" /> <input type="submit" value="Submit" />
</form>


<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${actorsInJSP}" var="actor">
		<tr>
			<!-- What do we print here for each actor? -->
			<td><c:out value="${actor.firstName}" /> <c:out
					value="${actor.lastName}" /></td>

		</tr>
	</c:forEach>
</table>
<%@include file="common/footer.jspf"%>