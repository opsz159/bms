<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
	<h3>회원탈퇴</h3>
	<form name="frm_mod_member" action="${contextPath}/member/deleteMember" method="post" >
		<table class="table table-bordered table-hover">
			<tr>
				<td align="center">
						<label for="memberId">아이디</label>
				</td>
				<td>
				<input name="memberId" id="memberId" type="text" class="form-control" value="${sessionScope.memberInfo}" readonly/>
				</td>
			</tr>
			<tr>
				<td align="center">비밀번호</td>
				<td><input type="password" name="memberPw" class="form-control" placeholder="비밀번호를 입력하세요." /></td>
			</tr>
			<tr >
				<td colspan="2" align="center">
					<input type="submit" class="btn btn-primary btn-sm" value="탈퇴하기"/> 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>