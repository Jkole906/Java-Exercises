<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<c:set var="pageTitle" value="Product Tiles View" />
<%@ include file="common/header.jspf"%>



<div class="row">

	<c:forEach items="${productList}" var="product">

		<div class="block">
			<c:url var="productDetailsUrl" value="/productDetails">
				<c:param name="productId" value="${product.productId}" />
			</c:url>
			<c:url var="image" value="/img/${product.imageName}" />
			<td><a href="${productDetailsUrl}"><img src="${image}"
					width=100% height=100% /></a></td>
			<div class="greenBox">
				<c:out value="${product.name}" />
				<fmt:formatNumber value="${product.averageRating}"
					maxFractionDigits="0" var="star" />

				<div class="starsAndIngredients">




					<c:url var="star" value="/img/${star}-star.png" />
					<img class="ratingStyle" src="${star}" width=15% height=automatic />

		
				</div>
			</div>
		</div>
	</c:forEach>

</div>
























<%@ include file="common/footer.jspf"%>