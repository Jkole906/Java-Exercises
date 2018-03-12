<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Review Input</title>
	</head>
	<body>
		<h1>Write a review!</h1>
		<br></br>
		
		<c:url value="/submitReview" var = "reviewSubmitUrl"/>
		<form action="${reviewSubmitUrl}" method="POST"> <!-- ASK JOE - This returns to the right page, but no updates???? -->
 Username:<br>
  <input type="text" name="username" value="" placeholder="Your username..."><br>
	Rating:<br>
	
		<input type="number"  min="1" max="5" name="rating">
  
  	<br>
  Review Title:<br>
  <input type="text" name="review_title" value="" placeholder="Title..."><br>
Review Text:<br>
 <textarea maxlength="900" rows="10" cols="50" name="review_text" placeholder="Enter review here. Max 900 characters."></textarea>
 <br>
  <br>
  <input type="submit" value="Submit Review">
</form>


	</body>
</html>



<!-- method = POST -->