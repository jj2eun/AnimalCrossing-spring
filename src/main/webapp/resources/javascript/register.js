/**
 * 회원가입 유효성 체크
 */
function registerCheck(obj){
	var getCheck = /^[a-zA-Z0-9]{4,12}$/; // 아이디 유효성 검사(영문자,숫자 4~12자리)
	var getPwdCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^+=-])(?=.*[0-9]).{8,25}$/; // 비밀번호 유효성 검사(영문자+숫자+특수문자 조합 8~25자리)
	var getName= RegExp(/^[가-힣]+$/); // 이름 유효성 검사(한글)
	var getMail = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i; // 이메일 유효성검사
	
	// 아이디 공백 확인
	if($('input[id=userId]').val() == ''){
		alert("아이디를 반드시 입력해 주세요.");
		$('input[id=userId]').focus();
		return false;
	}
	// 아이디 중복체크 여부
	
	// 아이디 유효성 체크
	if(!getCheck.test($('input[id=userId]').val())){
		alert("아이디를 형식에 맞게 입력해 주세요.");
		$('input[id=userId]').val("");
		$('input[id=userId]').focus();
		return false;
	}
	// 비밀번호 공백 확인
	if($('input[id=userPassword]').val() == ''){
		alert("비밀번호 반드시 입력해 주세요.");
		$('input[id=userPassword]').focus();
		return false;
	}
	// 아이디와 비밀번호 같음 확인
	if($('input[id=userPassword]').val() == $('input[id=userId]').val()){
		alert("아이디와 비밀번호가 같습니다.");
		$('input[id=userPassword]').val('');
		$('input[id=userPassword]').focus();
		return false;
	}
	// 비밀번호 유효성 체크
	if(!getPwdCheck.test($('input[id=userPassword]').val())){
		alert("비밀번호를 형식에 맞게 입력해 주세요.");
		$('input[id=userPassword]').val("");
		$('input[id=userPassword]').focus();
		return false;
	}
	// 비밀번호 재입력 확인
	if($('input[id=passwordCheck]').val() == ''){
		alert("비밀번호를 한 번 더 입력해 주세요.");
		$('input[id=passwordCheck]').focus();
		return false;
	}
	// 비밀번호 서로 확인
	if($('input[id=userPassword]').val() != $('input[id=passwordCheck]').val()){
		alert("비밀번호가 상이합니다.");
		$('input[id=userPassword]').val('');
		$('input[id=passwordCheck]').val('');
		$('input[id=userPassword]').focus();
		return false;
	}
	// 이름 공백 검사
	if($('input[id=userName]').val() == ''){
		alert("이름을 반드시 입력해 주세요.");
		$('input[id=userName]').focus();
		return false;
	}
	// 이름 유효성 검사
	if(!getName.test($('input[id=userName]').val())){
		alert("이름을 형식에 맞게 입력해주세요.");
		$('input[id=userName]').val("");
		$('input[id=userName]').focus();
		return false;
	}
	// 닉네임 공백 검사
	if($('input[id=userNickname]').val() == ''){
		alert("닉네임을 반드시 입력해 주세요.");
		$('input[id=userNickname]').focus();
		return false;
	}
	// 이메일 공백 검사
	if($('input[id=userEmail]').val() == ''){
		alert("이메일을 반드시 입력해 주세요.");
		$('input[id=userEmail]').focus();
		return false;
	}
	// 이메일 유효성 검사
	if(!getMail.test($('input[id=userEmail]').val())){
		alert("이메일 형식에 맞게 입력해주세요.");
		$('input[id=userEmail]').val("");
		$('input[id=userEmail]').focus();
		return false;
	}
	// 주소 공백 검사
	if($('input[id=userZipcode]').val() == '' || $('input[id=userAddress]').val() == '' || $('input[id=userAddressDetail]').val() == ''){
		alert("주소를 반드시 입력해 주세요.");
		return false;
	}
	return true;
}

// 아이디 중복체크
function idCheck(){
	
}