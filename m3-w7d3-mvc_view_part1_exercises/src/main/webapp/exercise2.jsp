<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
		<c:set var= "currentFib" value="1"/>
		<c:set var= "previousFib" value="0"/>
		<c:forEach begin="0" end="25">
				<c:set var= "temp" value= "${currentFib}"/>
				<c:set var= "currentFib" value= "${previousFib + temp}"/>
				<c:set var= "previousFib" value="${temp}"/>
				<li>${currentFib}</li>
		
		</c:forEach>
				<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
		</ul>
	</body>
</html>