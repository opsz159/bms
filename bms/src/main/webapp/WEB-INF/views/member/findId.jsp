<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
	<h3>검색결과</h3>
	<table class="table table-hover">
		<colgroup>
			<col width="20%">
			<col width="60%">
		</colgroup>
		<c:forEach items="${member}" var="member">
		<tr>
			<td colspan="2">${member.memberId}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="2" align="center">
			<input class="btn btn-primary btn-sm" type="button" value="메인으로" onclick="location.href='${contextPath}/main/main'"/>
			<input class="btn btn-primary btn-sm" type="button" value="로그인페이지" onclick="location.href='${contextPath}/member/loginForm'"/>
			</td>
		</tr>
	</table>
</body>
</html>