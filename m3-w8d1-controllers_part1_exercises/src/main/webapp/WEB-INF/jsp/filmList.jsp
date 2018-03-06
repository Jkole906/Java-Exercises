<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<%@include file="common/header.jspf"%>

<c:url value="/filmList" var="formAction" />
<form method="GET" var="${formAction}">
	<label for="genre">Genre: </label> <select id="genre" name="genre"
			placeholder="select one">
		<option value="Action">Action</option>
		<option value="Animation">Animation</option>
		<option value="Children">Children</option>
		<option value="Classics">Classics</option>
		<option value="Comedy">Comedy</option>
		<option value="Documentary">Documentary</option>
		<option value="Drama">Drama</option>
		<option value="Foreign">Foreign</option>
		<option value="Games">Games</option>
		<option value="Horror">Horror</option>
		<option value="Music">Music</option>
		<option value="New">New</option>
		<option value="Sci-Fi">Sci-Fi</option>
		<option value="Sports">Sports</option>
		<option value="Travel">Travel</option>
	</select>






	<%@include file="common/footer.jspf"%>