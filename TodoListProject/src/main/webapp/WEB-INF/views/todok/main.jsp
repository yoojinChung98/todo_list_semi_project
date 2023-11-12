<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ page import="java.net.URLEncoder" %>
    <%@ page import="java.net.URL" %>
      <%@ page import="java.net.HttpURLConnection" %>
        <%@ page import="java.io.BufferedReader" %>
          <%@ page import="java.io.InputStreamReader" %>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
              <!DOCTYPE html>
              <html>

              <head>
                <meta charset="utf-8" />
                <link rel="icon" href="/favicon.ico" />
                <meta name="viewport" content="width=device-width, initial-scale=1" />
                <meta name="theme-color" content="#000000" />
                <title>Todok Main</title>
                <link rel="stylesheet" href="${pageContext.request.contextPath}/font/AmSeuTeReuDam.ttf" />
                <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro%3A400" />
                <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inter%3A400" />
                <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/main.css" />
                <script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js"
                  charset="utf-8"></script>
                <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
              </head>

              <body>




                <button type="button" id="deleteButton">로그아웃하기</button>

                <div class="main-eLH">
                  <div class="auto-group-2bkm-y7f">

                    <div class="calendar-HPF">
                      <div class="calheader-nL1">
                        <div class="auto-group-bh6z-tdw">
                          <img class="leftbtn-2EM" src="${pageContext.request.contextPath}/assets/leftbtn.png" />
                          <div class="yearmonth-YTb">2023년 10월</div>
                          <img class="rightbtn-2tZ" src="${pageContext.request.contextPath}/assets/rightbtn.png" />
                        </div>
                        <img class="calbottomline-MA9" src="REPLACE_IMAGE:138:230" />
                      </div>
                      <div class="caldays-suB">
                        <div class="days-Rfo">
                          <img class="daybox-BQ5" src="${pageContext.request.contextPath}/assets/daybox-Z8d.png" />
                          <div class="sun-7oX">일</div>
                        </div>
                        <div class="auto-group-cjxt-byb">
                          <div class="days-LgH">
                            <img class="daybox-hFw" src="${pageContext.request.contextPath}/assets/daybox-RnR.png" />
                            <div class="mon-SDX">월</div>
                          </div>
                          <div class="days-8s3">
                            <img class="daybox-Vhb" src="${pageContext.request.contextPath}/assets/daybox.png" />
                            <div class="tue-FRs">화</div>
                          </div>
                          <div class="days-ME1">
                            <img class="daybox-hYm" src="${pageContext.request.contextPath}/assets/daybox-2tq.png" />
                            <div class="wen-rRf">수</div>
                          </div>
                          <div class="days-Z5B">
                            <img class="daybox-WWD" src="${pageContext.request.contextPath}/assets/daybox-y3X.png" />
                            <div class="tur-GEV">목</div>
                          </div>
                          <div class="days-dUM">
                            <img class="daybox-Bkm" src="${pageContext.request.contextPath}/assets/daybox-C3s.png" />
                            <div class="fri-wE9">금</div>
                          </div>
                          <div class="days-3HB">
                            <img class="daybox-oGM" src="${pageContext.request.contextPath}/assets/daybox-pWD.png" />
                            <div class="sat-Ln5">토</div>
                          </div>
                        </div>
                      </div>
                      <div class="calnum-qyj">
                        <div class="numbers-bCD">1</div>
                        <div class="auto-group-yee5-VHb">
                          <div class="item-1-113">8</div>
                          <div class="item-1-huT">9</div>
                          <div class="item-1-RKf">10</div>
                          <div class="item-1-8zm">11</div>
                          <div class="item-1-Tn9">12</div>
                          <div class="auto-group-eu5k-MMj">
                            <div class="item-1-5Yd">13</div>
                            <div class="item-1-pFK">14</div>
                          </div>
                        </div>
                        <div class="auto-group-x7sh-wqj">
                          <div class="item-1-DYM">15</div>
                          <div class="item-1-jWh">16</div>
                          <div class="item-1-Svu">17</div>
                          <div class="item-1-Zkd">18</div>
                          <div class="auto-group-tok7-f2y">
                            <div class="item-1-avd">19</div>
                            <div class="item-1-7Qm">20</div>
                          </div>
                          <div class="item-1-RRT">21</div>
                        </div>
                        <div class="auto-group-wrbp-XjP">
                          <div class="item-1-eJD">22</div>
                          <div class="item-1-Xso">23</div>
                          <div class="item-1-dA9">24</div>
                          <div class="auto-group-v8kh-trm">
                            <div class="item-1-EQq">25</div>
                            <div class="item-1-YRX">26</div>
                          </div>
                          <div class="auto-group-usih-GcR">
                            <div class="item-1-QCq">27</div>
                            <div class="item-1-iDX">28</div>
                          </div>
                        </div>
                        <div class="auto-group-fhn1-FUM">
                          <div class="item-1-ZE9">29</div>
                          <div class="item-1-5TP">30</div>
                          <div class="item-1-LPK">31</div>
                          <div class="item-1-G25">2</div>
                          <div class="auto-group-koez-B93">
                            <div class="item-1-7Hb">3</div>
                            <div class="item-1-eHX">4</div>
                          </div>
                          <div class="item-1-NzD">5</div>
                        </div>
                        <div class="auto-group-gsf7-HbP">
                          <div class="item-1-Nsj">2</div>
                          <div class="item-1-6Hw">3</div>
                          <div class="item-1-QpR">4</div>
                          <div class="item-1-MUm">5</div>
                          <div class="item-1-6hF">6</div>
                          <div class="item-1-cfb">7</div>
                        </div>
                      </div>
                    </div>
                    <div class="boardmain-fNy">
                      <div class="recommain-CNu">
                        <div class="recomtext-9Z3">토독이 추천하는 오늘의 할 일</div>
                        <div class="recomtodo-Fry">
                          <div class="profilecircle-BVj">
                          </div>
                          <div class="auto-group-ag6m-uAq">
                            <div class="userid-SRf">user1abce RksliIekk</div>
                            <div class="this-is-one-line-content-vrd">40 바이트, 20글자만 들어가므로 원라인인</div>
                          </div>
                          <div class="auto-group-drq3-G9o">
                            <div class="k-CZF">21.2k</div>
                            <img class="like-Umf" src="${pageContext.request.contextPath}/assets/like-hRT.png" />
                          </div>
                        </div>
                      </div>
                      <div class="mostlikemain-jhb">
                        <div class="mostliketext-gcq">가장 많은 좋아요를 받은 할 일</div>
                        <div class="mostliketodo1-z7j">
                          <div class="profilecircle-i3j">
                          </div>
                          <div class="auto-group-4rdx-2aD">
                            <div class="userid-AgR">user1abce RksliIekk</div>
                            <div class="this-is-one-line-content-6py">40 바이트, 20글자만 들어가므로 원라인인</div>
                          </div>
                          <div class="auto-group-zp4z-EwB">
                            <div class="k-b13">21.2k</div>
                            <img class="like-TJ9" src="${pageContext.request.contextPath}/assets/like-RBX.png" />
                          </div>
                        </div>
                        <div class="mostliketodo2-vBj">
                          <div class="profilecircle-c4Z">
                          </div>
                          <div class="auto-group-acz5-8Yh">
                            <div class="userid-sWH">user1abce RksliIekk</div>
                            <div class="this-is-one-line-content-1Mb">40 바이트, 20글자만 들어가므로 원라인인</div>
                          </div>
                          <div class="auto-group-mmry-hER">
                            <div class="k-dtm">21.2k</div>
                            <img class="like-weZ" src="${pageContext.request.contextPath}/assets/like-p41.png" />
                          </div>
                        </div>
                        <div class="mostliketodo3-DMB">
                          <div class="profilecircle-Lgh">
                          </div>
                          <div class="auto-group-uzsu-qtM">
                            <div class="userid-yUm">user1abce RksliIekk</div>
                            <div class="this-is-one-line-content-VCD">40 바이트, 20글자만 들어가므로 원라인인</div>
                          </div>
                          <div class="auto-group-dwd3-dJR">
                            <div class="k-aDf">21.2k</div>
                            <img class="like-dhj" src="${pageContext.request.contextPath}/assets/like-71j.png" />
                          </div>
                        </div>
                      </div>
                      <div class="goboardbtn-WWd">go to board</div>
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
                        <img class="checkbox-dQD"
                          src="${pageContext.request.contextPath}/assets/checkbox-nochecked.png" />
                        <!-- 체크된 이미지 : "${pageContext.request.contextPath}/assets/checkbox-checked.png" -->
                        <p class="todotext-A9F">React 공부하기</p>
                      </div>
                      <div class="todobottom-62u">
                        <div class="auto-group-nalr-Q3b">할 일을 입력 후 ENTER를 눌러주세요</div>
                        <img class="doplusbtn-sxm" src="${pageContext.request.contextPath}/assets/doplusbtn-8rD.png" />
                      </div>
                    </div>

                  </div>




                  <div class="mainheader-LrM">
                    <a href="http://127.0.0.1:80/todoproject/todok/myaccount" id="myaccount">
                      <div class="headuserprofile-Ewj"></div>
                    </a>

                    <div class="auto-group-rn1p-xcq">
                      <div class="weathericon-WeM">
                      </div>
                      <div class="userid-DHs">000님, 어서오세요</div>
                    </div>
                    <img class="todoksidelogo-78M"
                      src="${pageContext.request.contextPath}/assets/todoksidelogo-weZ.png" />
                  </div>
                </div>

                <!-- <p>Received data: ${result}</p> -->


                <% HttpSession setId=request.getSession(); Object sessioncon=setId.getAttribute("userId"); %>


                  <script type="text/javascript">





                    if (!sessionStorage.getItem("userId")) {
                      console.log("session 없음")
                      // var naver_id_login = new naver_id_login("W7Mq7kXYF3dBqzpj2kxG", "http://localhost/todoproject/todok/main");
                      // // 접근 토큰 값 출력
                      // /*   alert(naver_id_login.oauthParams.access_token); */
                      // // const token = naver_id_login.oauthParams.access_token;
                      // // fetch('${pageContext.request.contextPath}/todok/login/naver/' + token, {
                      // //   method: 'POST',
                      // // })
                    } else{
                    	console.log("session 있음")
                    }
                    


                    // if (naver_id_login.is_callback == true) {
                    //   naver_id_login.get_naver_userprofile("callbackFunction()");
                    // }
                    // naver_id_login.get_naver_userprofile("naverSignInCallback()");
                    // // 네이버 사용자 프로필 조회 이후 프로필 정보를 처리할 callback function
                    // function naverSignInCallback() {
                    //   alert(naver_id_login.getProfileData('id'));
                    //   sessionStorage.setItem('sessionId', naver_id_login.getProfileData('id'));
                    //   return;

                    // };



                    // function deleteAllCookies() {
                    //   var cookies = document.cookie.split(";");

                    //   for (var i = 0; i < cookies.length; i++) {
                    //     var cookie = cookies[i];
                    //     var eqPos = cookie.indexOf("=");
                    //     var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
                    //     document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT;path=/";
                    //   };
                    // };

                    // document.getElementById('deleteButton').onclick(function () {
                    //   console.log("데이터삭제버튼 누름");
                    //   localStorage.removeItem('nil_state');
                    //   sessionStorage.removeItem('sessionId');
                    //   deleteAllCookies();
                    // });





                  </script>

              </body>