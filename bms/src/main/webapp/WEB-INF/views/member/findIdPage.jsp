<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script>
	var check = "${check}";
		if (check != ""){
			alert(check);
		}
</script>
</head>
<body>
	<h3>아이디 찾기</h3>
	<form action="${contextPath}/member/findId" method="post">
		<table class="table table-hover">
			<tr>
				<td align="center"><label for="memberName">이름</label></td>
				<td><input class="form-control" id="memberName" name="memberName" type="text" placeholder="이름을 입력하세요." /></td>
			</tr>
			<tr >
				<td colspan="2" align="center"><input type="submit" class="btn btn-primary btn-sm" value="아이디찾기"></td>
			</tr>
		</table>
	</form>
</body>
</html>