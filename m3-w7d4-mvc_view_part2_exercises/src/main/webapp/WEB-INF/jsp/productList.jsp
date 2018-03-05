<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Product List View" />
<%@ include file="common/header.jspf" %>


<h2>Toy department</h2>


<div class="row">

	<c:forEach items="${products}" var="recipe">

		<div class="block" >
			<c:url var="productUrl" value="/productList">
				<c:param name="productId" value="${product.productId}" />
			</c:url>
			<c:url var="image" value="/img/product${product.productId}.jpg" />
			<td><a href="${productUrl}"><img src="${image}"
					width=100%  height=100% /></a></td>
			<div class="greenBox">
				<c:out value="${product.name}" />
				<fmt:formatNumber value="${product.averageRating}"
					maxFractionDigits="0" var="star" />

				<div class="starsAndIngredients">

					<c:url var="star" value="/img/${star}-star.png" />
					<img class = "ratingStyle" src="${star}" width=15% height=automatic />

				</div>
			</div>
		</div>
	</c:forEach>

</div>




<%@ include file="common/footer.jspf"%>