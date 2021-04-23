<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<div>
		<a href="${root}/home.do">home.jsp 이동하기</a>
		<a href="${root}/board/heirachy/list.do">답글형(Q&A)게시판 목록</a>
		<a href="${root}/board/free/list.do">자유게시판 목록</a>
		<a href="#">갤러리</a>
		<!-- 로그인이 안되어 있으면 -->
		<a href="${root}/member/login.do">로그인</a>
		<a href="${root}/member/register.do">회원가입</a>
		
		<!-- 로그인이 되어있으면 -->
		<a href="${root}/member/logout.do">로그아웃</a>
		<a href="${root}/member/update.do">회원정보수정</a>
		<a href="${root}/member/delete.do">회원탈퇴</a>
	</div>
</body>
</html>