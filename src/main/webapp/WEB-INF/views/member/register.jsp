<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>::회원가입</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<!-- javascript -->
<script type="text/javascript" src="${root}/resources/javascript/register.js?ver=1"></script>
</head>
<body>
<!-- 다음 우편번호 찾기 API  -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
	function searchZipcode(){
		new daum.Postcode({
	        oncomplete: function(data) {
	            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
	            $('#userZipcode').val(data.zonecode);
	            $('#userAddress').val(data.address);
	        }
	    }).open();
	}
</script>
	<div class="container">
  		<main>
  			<h3>회원가입</h3>
  			<form class="form-floating" action="${root}/member/registerOk.do" method="post" onsubmit="return registerCheck(this)">
  				<div>
  					<label>아이디</label>
  					<input type="text" class="form-control" id="userId" name="userId" placeholder="아이디를 입력해 주세요">
  					<button class="btn btn-warning" type="button">아이디 중복체크</button>
  				</div>
  				<div>
  					<label>비밀번호</label>
  					<input type="password" class="form-control" id="userPassword" name="userPassword" placeholder="비밀번호를 입력해 주세요">
  				</div>
  				<div>
  					<label>비밀번호 확인</label>
  					<input type="password" class="form-control" id="passwordCheck" placeholder="비밀번호를 다시 입력해 주세요">
  				</div>
  				<div>
  					<label>이름</label>
  					<input type="text" class="form-control" id="userName" name="userName" placeholder="이름을 입력해 주세요">
  				</div>
  				<div>
  					<label>닉네임</label>
  					<input type="text" class="form-control" id="userNickname" name="userNickname" placeholder="닉네임을 입력해 주세요">
  				</div>
  				<div>
  					<label>이메일</label>
  					<input type="text" class="form-control" id="userEmail" name="userEmail" placeholder="이메일을 입력해 주세요">
  				</div>
  				<div>
  					<label>우편번호</label>
	  				<input type="text" class="form-control" id="userZipcode" name="userZipcode">
  					<button class="btn btn-primary" id="userZipcode_btn" type="button" onclick="searchZipcode()">우편번호 찾기</button>
  					
  				</div>
  				<div>
  					<label>주소</label>
  					<input type="text" class="form-control" id="userAddress" name="userAddress">
  				</div>
  				<div>
  					<label>상세주소</label>
  					<input type="text" class="form-control" id="userAddressDetail" name="userAddressDetail">
  				</div>
  				<input type="submit" class="btn btn-primary" value="회원가입">
  				<input type="reset"  class="btn btn-secondary" value="취소">
  			</form>
  		</main>
	</div>
</body>
</html>