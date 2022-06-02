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
		<c:when test="${user == 'memberInfo'}">
		   <li>
				<h3>마이페이지 </h3>
				<ul>
					<li><a href="${contextPath}/member/showOneMember">회원정보</a></li>
					<li><a href="${contextPath}/order/orderMain">주문배송</a></li>
				</ul>
			</li>
			<br><br><br>
		</c:when>
		<c:otherwise>
			<li>
				<h3>로그인후 사용가능</h3>
				<ul>
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
		<a href="https://www.unicef.or.kr/event/for-everychild-promise2-1/?trackcode=n_ro_dad_promise2&utm_source=naver&utm_medium=cpm&utm_content=%EB%A1%A4%EB%A7%81%EB%B3%B4%EB%93%9C_PROMISE2_P%EB%A7%818%EC%98%B7%ED%95%80%EC%9D%B4%EC%9C%A0&utm_campaign=promise2&mac_ad_key=2157838943"><img width="190" height="163" src="${contextPath}/resources/image/unicef.jpg"> </a>
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