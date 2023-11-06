<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <meta name="theme-color" content="#000000" />
  <title>Todok Join</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro%3A400" />
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inter%3A400" />
  <link rel="stylesheet" href="./styles/join.css" />
</head>


<body>
  <div class="join-z81">
    <div class="joinbox-h2R">
      <img class="todoksidelogo-qmK" id="miniLogo" src="./assets/todoksidelogo-eNM.png" />
      <div class="auto-group-4ykb-khP">
        <div class="joinheader-5jf">
          <div class="joinheader-pSM">회원 가입</div>
          <p class="todok-todok-W4H">TODOK TODOK</p>
        </div>
      </div>

      <!-- form 시작 -->
      <form action=" ${pageContext.request.contextPath}/todok/join" method="post" name="joinForm">
        <div class="id-VjX">
          <div class="idtext-daq">아아디</div>
          <div class="auto-group-75km-mS9">
            <input name="userId" id="userId" type="text" class="inputidbox-Vsw" placeholder="아이디를 입력해주세요"  />
            <div class="auto-group-4l25-n6M">
              <a href="#" class="idchecktext-L7s" id="idCheckBtn" >
                <img class="btn-qaR" src="./assets/btn.png" />&nbsp;&nbsp;&nbsp;&nbsp;아이디 중복확인</a>
              <!-- <img class="btn-qaR" src="./assets/btn.png" /> button태그로 감싼 이미지는 버튼으로 눌리지않아 a태그로 바꿨습니다.-->
            </div>
          </div>
        </div>
        <div class="pw-8kZ">
          <div class="pwtext-UZX">비밀번호</div>
          <input name="userPw" id="userPw" type="password" class="inputidbox-xUh" placeholder="비밀번호를 입력해주세요">
          </input>
        </div>
        <div class="pwcheck-YnM">
          <div class="pwchecktext-VBo">비밀번호 확인</div>
          <input name="userPwCheck" type="password" class="inputidbox-Ddb" placeholder="입력한 비밀번호를 다시 입력해주세요">
          </input>
        </div>
        <div class="name-D5s">
          <div class="nametext-WKs">이름</div>
          <input name="name" id="name" type="text" class="inputidbox-cNu" placeholder="이름을 입력해주세요">
          </input>
        </div>
        <div class="nickname-6tR">
          <div class="nicknametext-p3j">닉네임</div>
          <input name="nickName" type="text" class="inputidbox-htD" placeholder="닉네임을 입력해주세요(특수문자 사용은 불가능합니다)">
          </input>
        </div>
        <div class="email-83B">
          <div class="emailconfirm-f37">
            <div class="email-xnu">Email</div>
            <input name="email1" type="text" class="inputidbox-FGD" placeholder="이메일을 입력해주세요">
            </input>
            <div class="item--L2m">@</div>
            <input name="email2" type="text" class="selectdbox-gVw">
            <!-- <select class="selectdbox-gVw">
              <option>naver.com</option>
              <option>google.com</option>
              <option>daum.net</option>
            </select> -->
            <div class="auto-group-zym7-oKf">
              <button type="button" class="emailconfirmtext-Koo">이메일 인증</button>
              <img class="emailconfirmbtn-CMo" src="./assets/btn.png" />
            </div>
          </div>
          <div class="emailcheck-WtH">
            <input name="checkNumber" type="text" class="selectdbox-S1F" placeholder="인증번호를 입력해주세요요">
            </input>
            <div class="auto-group-rqhb-k1w">
              <button type="button" class="emailchecktext-NJD">인증 확인</button>
              <img class="emailcheckbtn-Qkh" src="./assets/btn.png" />
            </div>
          </div>
        </div>

        <div class="joinorcancelbtn-BiH">
          <div class="auto-group-nnzd-WVf">
            <div class="joinbtn-8G9">
              <button type="submit" id="joinBtn" class="jointext-41P" class="joinBtnImg">회원가입</button>
            </div>
          </div>
          <div class="auto-group-ha5f-Cmo">
            <div class="cancelbtn-e81">
              <button type="button" id="cancelBtn" class="canceltext-xFB">취소</button>
            </div>
          </div>
        </div>
      </form>
      <!-- form 태그 끝 -->


    </div>
    <div class="joinfooter-7Zs">
      <div class="footerline"></div>
      <div class="joinfootertext-19T">문의하기 sakdjfa@naver.com 개발자: 김혜진 강태승 박찬규 이종선 정유진 최정현</div>
    </div>
  </div>
  <script>

    //아이디 공백 체크
    document.getElementById('idCheckBtn').onclick = function() {

      const userId = document.getElementById('userId').value;
      console.log('userId: ' + userId);
      if(userId === '') {
          alert('아이디를 입력해 주세요.');
          return;
      }
    };
    




  </script>
</body>