<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
	 <ul>
	  <c:choose>
		<c:when test="${sideMenu == 'adminMode'}">
		   <li>
				<h3>주요기능</h3>
				<ul>
					<li><a href="${contextPath}/admin/member/adminMemberMain">회원 관리</a></li>
					<li><a href="${contextPath}/admin/goods/adminGoodsMain">상품 관리</a></li>
					<li><a href="${contextPath}/admin/order/adminOrderMain">주문 관리</a></li>
				</ul>
			</li>
			<br><br><br>
		</c:when>
		<c:when test="${sideMenu == 'user'}">
		   <li>
				<h3>마이페이지</h3>
				<ul>
					<li><a href="${contextPath}/order/orderDetail">배송조회</a></li>
				</ul>
			</li>
			<br><br><br>
		</c:when>
		<c:otherwise>
			<li>
				<h3>목록 보기</h3>
				<ul>
					<li>로그인후 이용</li>
				</ul>
			</li>
			<br><br><br>
		 </c:otherwise>
		</c:choose>	
	  </ul>
	</nav>
	<div class="clear"></div>
	<div id="notice">
		<h2>공지사항</h2>
		<ul>
			<li><a href="#">BMS 개인정보 처리방침 개정 안내</a></li>
			<li><a href="#">BMS mobile 서비스 종료 안내 </a></li>
			<li><a href="#">마케팅정보 수신동의 확인 안내</a></li>
			<li><a href="#">북클럽 혜택 '커피 무료쿠폰' 종료 안내</a></li>
			<li><a href="#">BMS 이용약관 개정 안내</a></li>
		</ul>
	</div>
	<div class="clear"></div>
	
	<div id="banner">
		<a href="#"><img width="190" height="163" src="${contextPath}/resources/image/n-pay.jpg"> </a>
	</div>
	<div class="clear"></div>
	
	<div id="banner">
		<a href="http://shinsegaemall.ssg.com/event/eventDetail.ssg?promId=1100110485"><img width="190" height="362" src="${contextPath}/resources/image/side_banner1.jpg"></a>
	</div>
	<div class="clear"></div>
	
	<div id="banner">
		<a><img width="190" height="104" src="${contextPath}/resources/image/call_center_logo.jpg"></a>
	</div>
	<div class="clear"></div>
	
	<div id="banner">
		<a href="#"><img width="190" height="69" src="${contextPath}/resources/image/QnA_logo.jpg"></a>
	</div>
</body>
</html>