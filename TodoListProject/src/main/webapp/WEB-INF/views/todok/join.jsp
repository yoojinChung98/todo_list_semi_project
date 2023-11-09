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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/join.css" />
</head>


<body>
  <div class="join-z81">
    <div class="joinbox-h2R">
      <img class="todoksidelogo-qmK" id="miniLogo" src="${pageContext.request.contextPath}/assets/todoksidelogo-eNM.png" />
      <div class="auto-group-4ykb-khP">
        <div class="joinheader-5jf">
          <div class="joinheader-pSM">회원 가입</div>
          <p class="todok-todok-W4H">TODOK TODOK</p>
        </div>
      </div>

      <!-- form 시작 -->
      <form action="${pageContext.request.contextPath}/todok/join" method="post" name="joinForm">
        <div class="id-VjX">
          <div class="idtext-daq">아이디</div>
          <div class="auto-group-75km-mS9">
            <input name="userId" id="userId" type="text" class="inputidbox-Vsw" placeholder="영문 대,소문자, 숫자 6~15글자"  />
            <div class="auto-group-4l25-n6M">
              <a href="#" class="idchecktext-L7s" id="idCheckBtn" >
                <img class="btn-qaR" src="${pageContext.request.contextPath}/assets/btn.png" />아이디 중복확인</a><span id="msgId"></span>
              <!-- <img class="btn-qaR" src="./assets/btn.png" /> button태그로 감싼 이미지는 버튼으로 눌리지않아 a태그로 바꿨습니다.-->
            </div>
          </div>
        </div>
        <div class="pw-8kZ">
          <div class="pwtext-UZX">비밀번호</div>
          <input name="userPw" id="userPw" type="password" class="inputidbox-xUh" placeholder="비밀번호를 입력해주세요">
          </input><span id="msgPw"></span>
        </div>
        <div class="pwcheck-YnM">
          <div class="pwchecktext-VBo">비밀번호 확인</div>
          <input name="userPwCheck" id="userPwCheck" type="password" class="inputidbox-Ddb" placeholder="입력한 비밀번호를 다시 입력해주세요">
          </input><span id="msgPw-c"></span>
        </div>
        <div class="name-D5s">
          <div class="nametext-WKs">이름</div>
          <input name="name" id="name" type="text" class="inputidbox-cNu" placeholder="이름을 입력해주세요">
          </input>
        </div>
        <div class="nickname-6tR">
          <div class="nicknametext-p3j">닉네임</div>
          <input name="nickName" id="nickName" type="text" class="inputidbox-htD" placeholder="닉네임을 입력해주세요(특수문자 사용은 불가능합니다)">
          </input>
        </div>
        <div class="email-83B">
          <div class="emailconfirm-f37">
            <div class="email-xnu">Email</div>
            <input name="email1" id="email1" type="text" class="inputidbox-FGD" placeholder="이메일을 입력해주세요">
            </input>
            <div class="item--L2m"></div>
            <select name="email2" id="email2" class="selectdbox-gVw">
              <option>@naver.com</option>
              <option>@google.com</option>
              <option>@daum.net</option>
            </select>
            <div class="auto-group-zym7-oKf">
              <button type="button" id="emailCheck" class="emailconfirmtext-Koo" >이메일 인증</button>
              <!-- <img class="emailconfirmbtn-CMo" src="${pageContext.request.contextPath}/assets/btn.png" /> 클릭버튼 테스트중 -->
            </div>
          </div>
          <div class="emailcheck-WtH">
            <input name="checkNumber" id="checkNumber" type="text" class="selectdbox-S1F" 
            placeholder="인증번호를 입력하세요" maxlength="6" disabled="disabled"></input>
            <div class="auto-group-rqhb-k1w">
              <button type="button" name="checkNumber-c" id="checkNumber-c" class="emailchecktext-NJD">인증 확인</button>
              <!-- <img class="emailcheckbtn-Qkh" src="${pageContext.request.contextPath}/assets/btn.png" /> 클릭버튼 테스트중 -->
            </div>
          </div>
        </div>

        <div class="joinorcancelbtn-BiH">
          <div class="auto-group-nnzd-WVf">
            <div class="joinbtn-8G9">
              <button type="button" id="joinBtn" class="jointext-41P joinBtnImg">회원가입</button>
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

        let code = ''; // 이메일 인증번호 저장을 위한 변수.
        let idFlag, pwFlag; //정규표현식 유효성 검사 여부 판단. 


        //아이디 중복 체크
        document.getElementById('idCheckBtn').onclick = function() {

            const userId = document.getElementById('userId').value;
            //아래 if문은 정규표현식 적용시 사용할것
            console.log('userId: ' + userId);
            if(userId === '') {
                alert('아이디를 입력해주세요.');
                return;
            }

            if(!idFlag){
                alert('사용할 수 없는 아이디 입니다.');
                return;
            }

            fetch('${pageContext.request.contextPath}/todok/id/' + userId) 
            .then(res => res.text())
            .then(data => { 
                if(data === 'ok') {
                    document.getElementById('userId').setAttribute('readonly', true);
                    document.getElementById('idCheckBtn').setAttribute('disabled', true);
                    document.getElementById("userId").style.backgroundColor = "rgb(150 255 160 / 50%)";
                    document.getElementById('msgId').textContent = '사용 가능한 아이디 입니다.';
                } else {
                  document.getElementById('msgId').textContent = '이미 사용중인 아이디 입니다.';
                    document.getElementById('userId').focus();
                }
            });

        
        } //아이디 중복확인 끝

        //인증번호 이메일 전송
        document.getElementById('emailCheck').onclick = function(){
            const email = document.getElementById('email1').value + document.getElementById('email2').value;
            console.log('완성된 email:', email);
            
            fetch('${pageContext.request.contextPath}/todok/email', { 
                method:'post',
                headers: {'Content-Type': 'text/plain'},
                body: email
            })
            .then(res => res.text())
            .then(data => {
                console.log('인증번호: ', data);
                //비활성화된 인증번호 입력창을 활성화
                document.querySelector('.selectdbox-S1F').disabled = false; // disabled = false; 입력란 사용가능으로 변경
                document.getElementById("checkNumber").style.backgroundColor = "rgba(97, 97, 97, 0.150000006)";
                code = data;
                alert('인증번호가 전송되었습니다. 6자리 번호를 입력해 주세요.');
        })
        .catch(error => {
            alert('알수없는 문제가 발생하였습니다. 관리자에게 문의하세요.');
        }); // 비동기 끝.

    }; //이메일 인증 버튼 클릭 이벤트 끝 (구현완료)

     //인증번호 검증
     document.querySelector('.emailchecktext-NJD').onclick = function(e){
        console.log('클릭 이벤트 발생 확인')
        const inputCode = document.getElementById('checkNumber').value; // 사용자가 입력한 인증번호
        const $resultMsg = document.getElementById('emailchecktext-NJD'); //인증버튼
        console.log('사용자가 입력한 값: ', inputCode);

        if(inputCode === code) {
            alert('인증번호가 일치합니다.');
            document.querySelector('.selectdbox-S1F').disabled = true; //인증 입력창 비활성.
            document.getElementById('checkNumber-c').disabled = true; //인증 확인 버튼 비활성.
            document.querySelector('.emailconfirmtext-Koo').disabled = true; //이메일 인증 버튼을 비활성.
            document.getElementById("checkNumber").style.backgroundColor = "#9E9E9E";
            document.getElementById('email1').setAttribute('readonly', true);
            document.getElementById('email2').setAttribute('readonly', true);

            // e.target.style.display = 'text: "인증완료"'; // 인증번호 입력창 숨기기 (x)
   
        }else {
            alert('인증번호가 틀렸습니다.');
            e.target.focus();
        }


    } // 인증번호 검증 끝 (구현완료)

    //     /*아이디 형식 검사 스크립트*/
        var id = document.getElementById("userId");
        id.onblur = function() {
        // 정규표현식(영문 대,소문자, 숫자 6~15글자 사이)
        var regex = /^[A-Za-z0-9]{6,15}$/;
        if(regex.test(document.getElementById("userId").value.trim() )) {
          // console.log('입력한 value: ', document.getElementById("userId").value);
          // console.log('공백을 제거한 value: ', document.getElementById("userId").value.trim());
            document.getElementById("userId").style.backgroundColor = "rgb(255 167 167 / 50%)";
            document.getElementById("msgId").innerHTML = "아이디 중복체크는 필수 입니다";
            idFlag = true;

        } else {
            document.getElementById("userId").style.backgroundColor = "rgb(255 167 167 / 50%)";
            document.getElementById("msgId").innerHTML = "사용할 수 없는 아이디 입니다.";
            idFlag = false;
        }
      
    } //아이디 형식 검사 끝

        /*비밀번호 형식 검사 스크립트*/
        var pw = document.getElementById("userPw");
        pw.onkeyup = function(){
          // console.log('비번스팬태그!');
            var regex = /^[A-Za-z0-9]{8,16}$/; // 비밀번호 영문 대, 소문자 8~16 사이 
             if(regex.test(document.getElementById("userPw").value.trim() )) {
                document.getElementById("userPw").style.backgroundColor = "rgb(150 255 160 / 50%)";
                document.getElementById("msgPw").innerHTML = "사용 가능합니다";
                pwFlag = true;
            } else {
                document.getElementById("userPw").style.backgroundColor = "rgb(255 167 167 / 50%)";
                document.getElementById("msgPw").innerHTML = "비밀번호는 영문 대, 소문자 8~16사이로 작성해주세요.";
                pwFlag = false;
            }
        }
        /*비밀번호 확인검사*/
        var pwConfirm = document.getElementById("userPwCheck");
        pwConfirm.onkeyup = function() {
            // console.log('비번체크 스팬태그!');
            var regex = /^[A-Za-z0-9]{8,16}$/;
            if(regex.test(document.getElementById("userPwCheck").value.trim() )){
              if(document.getElementById("userPwCheck").value.trim() == document.getElementById("userPw").value.trim() ) {
                  document.getElementById("userPwCheck").style.backgroundColor = "rgb(150 255 160 / 50%)";
                  document.getElementById("msgPw-c").innerHTML = "비밀번호가 일치합니다";
                  pwFlag = true;
            }
            } else {
                document.getElementById("userPwCheck").style.backgroundColor = "rgb(255 167 167 / 50%)";
                document.getElementById("msgPw-c").innerHTML = "비밀번호를 확인하세요";
                pwFlag = false;
            }
        }

            // 폼 데이터 검증
    document.getElementById('joinBtn').onclick = function(e){
        if(idFlag && pwFlag){
            if(!document.getElementById('userId').getAttribute('readonly')){
              console.log('아이디 중복체크(폼)');
                alert('아이디 중복체크는 필수입니다.');
                return;
            }
            if(document.getElementById('name').value.trim() === ''){
              console.log('이름 중복체크(폼)');
                alert('이름을 입력해주세요.');
                return;
            }
            if(document.getElementById('nickName').value.trim() === ''){
              console.log('닉네임을 인증(폼)');
                alert('닉네임을 입력해주세요.');
                return;
            }
            if(!document.getElementById('emailCheck').disabled){
              console.log('이메일 중복체크(폼)');
                alert('이메일 인증을 완료해주세요.');
                return;
            }

            if(confirm('회원가입을 하시겠습니까?')){
              console.log('회원가입버튼(폼)');
                document.joinForm.submit();
            }else return;


        } else {
            alert('아이디와 비밀번호를 다시 확인해주세요.');
            return;
        }
    }





  </script>
</body>