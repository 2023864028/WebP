## 오픈챌린지03

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
 
</head>
<body>

 
  <header>
       <h2>스마트폰</h2>
        <p>스마트폰은 컴퓨터를 결합한 무선 휴대전화기이다. PC에서 실행되는 운영체제보다 작게 만든 모바일 운영체제를 탑재하여 인터넷 검색, 전자우편, 간단한 문서 편집, 카메라, 오디오 및 비디오 재생 등 PC의 기능을 거의 모두 갖추고 있다.</p>
       
   <audio src="media/audio.mp3" controls></audio>
  </header>

  <hr>

  
 <nav>
       <h3>목차</h3>
       <ul>
           <li><a href="#history">역사</a></li>
            <li><a href="#android">안드로이드폰</a></li>
            <li><a href="#iphone">아이폰</a></li>
            <li><a href="#sample">샘플</a></li>
        </ul>
    </nav>

   <hr>

    
   <section>

  <article id="history">
            <h3>역사</h3>
            <p>최초의 스마트폰은 사이먼(Simon)으로 추정된다. IBM사가 1992년에 설계하여 그 해에 미국 네바다 주의 라스베이거스에서 열린 컴덱스에서 컨셉 제품으로 전시되었다.</p>
        </article>


  <article id="android">
           <h3>안드로이드</h3>
            <p>안드로이드(영어: Android)는 휴대 전화를 비롯한 휴대용 장치를 위한 운영체제와 미들웨어, 사용자 인터페이스 그리고 표준 응용 프로그램(웹 브라우저, 이메일 클라이언트, 단문 메시지 서비스 등)을 포함하고 있는 소프트웨어 스택이자 모바일 운영 체제이다.</p>
        </article>


  <article id="iphone">
            <h3>아이폰</h3>
            <p>아이폰(영어: iPhone)은 2007년 1월 9일, 애플이 발표한 휴대전화 시리즈이다. 미국 샌프란시스코 모스콘 센터에서 열린 맥월드 2007에서 애플의 창업자 중 한명인 스티브 잡스가 발표했다.</p>
        </article>


   <article id="sample">
            <h3>샘플</h3>
    
   <img src="media/smartphones.png" alt="스마트폰 샘플 이미지" width="300">
        </article>
    </section>

   <hr>

   
   <footer>
        <p><a href="survey3.html" target="_blank">설문조사</a></p>
        <p>Copyright 2022 by Kitae</p>
    </footer>

</body>
</html>

## 실습문제 01

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
  
</head>
<body>
    <h3>버튼을 만들자</h3>
    <hr>
    <button>1</button>
    <button>2</button>
    <button>3</button><br>
    <button>4</button>
    <button>5</button>
    <button>6</button><br>
    <button>7</button>
    <button>8</button>
    <button>0</button>
</body>
</html>

## 실습문제 02

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    
</head>
<body>
    <h3>웹 브라우저 소개</h3>
    <hr>
    
   <table>
        <tbody>
            <tr>
                <td style="vertical-align: top; width: 200px;">
                    브라우저라고 불리기도 하는 웹 브라우저(Web Browser)는, 사용자에게 웹 서버 컴퓨터에 접속하고 웹 페이지, 이미지, 동영상, 음악 등 다양한 데이터 다운받아 보여주는 소프트웨어이다. 그림 1-2는 대표적인 Chrome 웹 브라우저를 보여준다.
                </td>
                
      
  <td>
                    <figure>
                        
  <img src="chrome.png" alt="구글 Chrome 웹 브라우저" width="200">
                        <figcaption>그림 1-2 구글 Chrome</figcaption>
                    </figure>
                </td>
            </tr>
            
  <tr>
                
  <td style="vertical-align: top;">
                    웹 페이지는 브라우저에 HTML5 문서임을 알리기 위해 그림 1-3과 같은 코드를 첫 라인에 삽입하여야 한다.
                </td>
                
  
  <td>
                   <figure>
          
  <code>
                            &lt;!doctype html&gt;<br>
                            &lt;html&gt;<br>
                            ...<br>
                            &lt;/html&gt;
                        </code>
                        <figcaption>그림 1-3 HTML5 문서 구성</figcaption>
                    </figure>
                </td>
            </tr>
        </tbody>
    </table>
</body>
</html>

## 실습문제 03

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">

</head>
<body>
    <h3>로그인 폼</h3>
    <hr>
    
  <form action="#">
        <fieldset>
            <legend>Login</legend>
            
  <label for="username">Username</label>
            <input type="text" id="username" name="username">
            
  <label for="password">Password</label>
         
  <input type="password" id="password" name="password">
        </fieldset>
    </form>
</body>
</html>

## 실습문제 04

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>웹 프로그래밍 개요</title>
</head>
<body>
    <h3>웹 프로그래밍 개요</h3>
    <hr>
    
 <details>
        <summary>웹의 기본 목적</summary>
        <p>웹의 기본 목적은 한 컴퓨터에서 만든 문서(document)를 다른 컴퓨터에서 쉽게 볼 수 있도록 하는 것이다</p>
    </details>
    
 <details>
        <summary>왜 Web인가?</summary>
        <p>전 세계의 컴퓨터들을 인터넷으로 거미줄처럼 연결하고 웹 문서를 쉽게 주고받을 수 있도록 시스템을 만들고 WWW(World Wide Web), 간단히 줄여 웹(Web)이라고 부른다.</p>
    </details>
    
   
 <details>
        <summary>웹 페이지를 구성하는 3 요소</summary>
        <ul>
            <li>HTML - 문서의 구조와 내용</li>
            <li>CSS(Cascading Style Sheet) - 문서의 모양</li>
            <li>Javascript - 행동 및 응용 프로그램</li>
        </ul>
    </details>

</body>
</html>

## 실습문제 05

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">

</head>
<body>
    <h3>도형 서식 폼 만들기</h3>
    <hr>
    
  <form action="#">
      <fieldset>
            <legend>도형 서식 입력</legend>
            
            
  <p>
                <label for="line-type">선종류</label>
                <select id="line-type" name="lineType" size="3">
                    <option value="none">선없음</option>
                    <option value="solid">실선</option>
                    <option value="dotted">점선</option>
                </select>
            </p>
            
        
   <p>
                <label for="line-weight">선두께</label>
                <input type="number" id="line-weight" name="lineWeight">
                
  <label for="line-color">선색</label>
               
  <input type="color" id="line-color" name="lineColor" value="#4A90E2">
            </p>
            
     
 <p>
                <label for="opacity">투명도(0~100) : </label>
                <input type="range" id="opacity" name="opacity" min="0" max="100">
            </p>
            
 </fieldset>
    </form>
</body>
</html>
