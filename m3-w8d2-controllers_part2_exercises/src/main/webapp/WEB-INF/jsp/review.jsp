<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>"Squirrel Parties for Dummies" by Craig Castelaz</title>
</head>
<body>
	<h1>
	"Squirrel Parties for Dummies" by Craig Castelaz	
    </h1>
	<table class="table">
		<tr>
			<th>
			<c:url var="DummiesImgSrc" value="/img/forDummies.png" />
	    		<img src="${DummiesImgSrc}" alt="Cover Image">
	    <br/>
			Reviews
			<br></br>
			
			</th>
		</tr>
		<c:forEach items="${reviews}" var="review">
			<tr>

				<td>
					<strong><c:out value="${review.title}" /><br/>
					<c:out  value="By: ${review.username}" /> </strong> 
					<br/>
					<em><sub><c:out value= "ID: ${review.id}" /></em></sub><br />
					
					<c:out value="Date : ${review.dateSubmitted}"></c:out>
					<br/>
					
					<c:forEach begin="1" end="${review.rating}">				
					<c:url var="StarImgSrc" value="/img/star.png" />
	    				<img src="${StarImgSrc}" alt="Star Image">
	    				</c:forEach>
					<br/>
					
					<em><c:out value="${review.text}" /> </em><br/>
					
					<br></br>

				</td>
			</tr>

		</c:forEach>
	</table>

	<form action="/mvc-controllers-part2-exercises/reviewInput">
	<input type="submit" value="Submit New Review">

	</form>


</body>
</html>


<!-- button with action /reviewInput  -->