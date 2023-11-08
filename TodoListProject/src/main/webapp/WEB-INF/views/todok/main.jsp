<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <meta name="theme-color" content="#000000" />
  <title>Todok Main</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro%3A400" />
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inter%3A400" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/main.css" />
</head>

<body>
  <div class="main-eLH">
    <div class="auto-group-2bkm-y7f">

      <section class="cal">
        <div class="header">
          <button class="nav-btn go-prev" onclick="prevMonth()">&lt;</button>
          <div class="year-month"></div>
          <button class="nav-btn go-next" onclick="nextMonth()">&gt;</button>
          <button class="nav-btn go-today" onclick="goToday()">Today</button>
        </div>
        <div class="main">
          <div class="days">
            <div class="day">일</div>
            <div class="day">월</div>
            <div class="day">화</div>
            <div class="day">수</div>
            <div class="day">목</div>
            <div class="day">금</div>
            <div class="day">토</div>
          </div>
          <div class="dates"></div>
        </div>
      </section>

      <div class="boardmain-fNy">
        <!------------------------------------가장 많은 좋아요G 시작------------------------------------->
        <div class="mostlikemain-jhb">
          <div class="mostliketext-gcq">가장 많은 좋아요를 받은 할 일</div>
          <!-- <button type="button" id="testBtn" onclick="exe()">테스트</button> -->


          <!-----좋아요 박스묶음. 나중에 로그인검증 구현되면, if문 받아서 디폴트값을 넣어서 3개 뽑는 예시 살려야함.------->

          <%-- <c:choose>
				<c:when test="로그인되어있을때~"> --%>

          <c:forEach var="item" items="${mostLike}">
            <div class="mostliketodo1-z7j">
              <div class="profilecircle-i3j" style="background-color: #${item.profileColor}">
                <!-- profile circle color 받아서 스타일 입력-->
              </div>

              <div class="auto-group-4rdx-2aD">
                <div class="userid-AgR">${item.userId}</div>

                <div class="this-is-one-line-content-6py">${item.content}</div>
              </div>

              <div class="auto-group-zp4z-EwB">
                <div class="k-b13">${item.boardLikeCnt}</div>
                <img class="like-TJ9" src="${pageContext.request.contextPath}/assets/like-RBX.png" />
              </div>
            </div>
          </c:forEach>

          <%-- </c:when> --%>

          <%-- <c:when test="로그인안돼있을때~">
		          <c:forEach var="i" begin="1" end="3" step="1">
		            <div class="mostliketodo1-z7j">
		              <div class="profilecircle-i3j" style="background-color: #D9D9D9">
		                <!-- profile circle color 받아서 스타일 입력-->
		              </div>
		
		              <div class="auto-group-4rdx-2aD">
		                <div class="userid-AgR">user ${i}</div>
		
		                <div class="this-is-one-line-content-6py">오늘의 추천 ${i}</div>
		              </div>
		
		              <div class="auto-group-zp4z-EwB">
		                <div class="k-b13">0</div>
		                <img class="like-TJ9" src="${pageContext.request.contextPath}/assets/like-RBX.png" />
		              </div>
		            </div>
		          </c:forEach>
		    	</c:when> --%>

          <%--  </c:choose> --%>


          <!---------------------------------------End B--------------------------------------------------------->
        </div>
        <!---------------------------------------End G-------------------------------------------------------->
        <button type="button" class="goboardbtn-WWd"
          onclick="location.href='${pageContext.request.contextPath}/todok/board'">
          go to board
        </button>


      </div>
    </div>
    <div class="todayslist-j8V">
      <div class="todoheader-bRb">
        <p class="todotitle-ux5">Today’s List</p>
        <p class="tododate-EDf">2023년 10월 30일</p>
        <div class="auto-group-g5y5-xfT">
          <p class="todoremain-4iV">할 일 1개 남음</p>
          <p class="tododay-Cph">월요일</p>
        </div>
      </div>
      <div class="haveto-Voo">
        <img class="checkbox-dQD" src="${pageContext.request.contextPath}/assets/checkbox.png" />
        <p class="todotext-A9F">React 공부하기</p>
      </div>
      <div class="todobottom-62u">
        <div class="auto-group-nalr-Q3b">할 일을 입력 후 ENTER를 눌러주세요</div>
        <img class="doplusbtn-sxm" src="${pageContext.request.contextPath}/assets/doplusbtn-8rD.png" />
      </div>
    </div>
    <div class="mainheader-LrM">
      <div class="headuserprofile-Ewj">
      </div>
      <div class="auto-group-rn1p-xcq">
        <div class="weathericon-WeM">
        </div>
        <div class="userid-DHs">000님, 어서오세요</div>
      </div>
      <img class="todoksidelogo-78M" src="${pageContext.request.contextPath}/assets/todoksidelogo-weZ.png" />
    </div>
  </div>








  <script>
    //--------------------------------달력-------------------------
    let date = new Date();

    const renderCalendar = () => {
      //달력 보여주는 함수----
      const viewYear = date.getFullYear();
      const viewMonth = date.getMonth();

      //현재 연도와 월 표시---
      document.querySelector('.year-month').textContent = `${viewYear}년 ${
    viewMonth + 1
  }월`;

      //지난달 마지막날과 이번달 마지막날 ---
      const prevLast = new Date(viewYear, viewMonth, 0); //2022 12 31 토
      const thisLast = new Date(viewYear, viewMonth + 1, 0); // 2023 1 31 화

      const PLDate = prevLast.getDate(); // 지난 달 마지막 날 31일
      const PLDay = prevLast.getDay(); // 지난달 마지막 요일 토요일(6)

      const TLDate = thisLast.getDate(); // 이번달 마지막 날 31일
      const TLDay = thisLast.getDay(); // 이번달 마지막 요일 화요일(2)

      //지난달 이번달 다음달 달력 배열 만들고 합치기
      const prevDates = [];
      const thisDates = [...Array(TLDate + 1).keys()].slice(1);
      const nextDates = [];

      //달력 합치기 ---
      if (PLDay !== 6) {
        for (let i = 0; i < PLDay + 1; i++) {
          prevDates.unshift(PLDate - i); //지난달 날짜들 넣어줌
        }
      }
      for (let i = 1; i < 7 - TLDay; i++) {
        nextDates.push(i); // 다음달 날짜 넣어줌
      }

      const dates = prevDates.concat(thisDates, nextDates); // 지난달 이번달 다음달 합쳐주기

      // 기존 이벤트 리스너 제거
      document.querySelectorAll('.this.click').forEach((e) => {
        e.removeEventListener('click', handleClick);
        e.classList.remove('click');
      });

      //화면에 날짜 뿌려주기
      const firstDateIndex = dates.indexOf(1); //이번달 1일의 인덱스 찾기
      const lastDateIndex = dates.lastIndexOf(TLDate); //이번달 막날의 인덱스 찾기

      dates.forEach((date, i) => {
        const condition =
          i >= firstDateIndex && i < lastDateIndex + 1 ? 'this' : 'other';
        dates[
          i
        ] = `<div class="date"><span class=${condition}>${date}</span></div>`;
      });

      document.querySelector('.dates').innerHTML = dates.join('');

      //오늘날짜 표시하기 ---
      const today = new Date();

      if (
        viewMonth === today.getMonth() &&
        viewYear === today.getFullYear()
      ) {
        for (let date of document.querySelectorAll('.this')) {
          if (+date.innerText === today.getDate()) {
            date.classList.add('today');
            break;
          }
        }
      }
      // 화면에 날짜 뿌려준 후에 새로운 이벤트 리스너 등록
      document.querySelectorAll('.this').forEach((e) => {
        e.addEventListener('click', handleClick);
      });
    };
    renderCalendar();

    const prevMonth = () => {
      console.log('prevMonth 동작');
      date.setMonth(date.getMonth() - 1);
      renderCalendar();
    };

    const nextMonth = () => {
      date.setMonth(date.getMonth() + 1);
      renderCalendar();
    };

    const goToday = () => {
      date = new Date();
      renderCalendar();
    };
    const nonClick = document.querySelectorAll('.this');

    function handleClick(event) {
      // 기존에 선택한 날짜에 대한 클래스를 찾아 제거
      document.querySelectorAll('.this.click').forEach((e) => {
        e.classList.remove('click');
      });

      // 클릭한 div에 "click" 클래스 추가
      event.target.classList.add('click');
    }

    nonClick.forEach((e) => {
      e.addEventListener('click', handleClick);
    });
    //----------------------------------달력----------------------------------------

    window.onload = function () {

      // getMostLike();

      // '가장 많은 좋아요를 받은 할 일' 을 List<dto>로 받아오는 함수
      /* function getMostLike() {
        fetch('todok/main/mostlike')
          .then(res => res.json())
          .then(data => {
            console.log("mostlike: ", data);
          })
        }; */


    };
  </script>
</body>