<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<c:set var="pageTitle" value="Product List View" />
<%@ include file="common/header.jspf"%>

<section class="centeredPanel">
	<h2>Toy department</h2>

	<ul>
		<div class="row">

			<c:forEach items="${products}" var="product">

				<div class="block">
					<c:url var="productUrl" value="/productList">
						<c:param name="productImg" value="${product.ImageName}" />
					</c:url>
					<c:url var="image" value="/img/${product.ImageName}.jpg" />
					<td><a href="${productUrl}"><img src="${image}" width=100%
							height=100% /></a></td>
					<div class="greenBox">
						<c:out value="${product.name}" />
						<fmt:formatNumber value="${product.averageRating}"
							maxFractionDigits="0" var="star" />

						<div class="stars">

							<c:url var="star" value="/img/${star}-star.png" />
							<img class="ratingStyle" src="${star}" width=15% height=automatic />

						</div>
					</div>
				</div>
			</c:forEach>
</ul>

</div>


	
</section>

<%@ include file="common/footer.jspf"%>