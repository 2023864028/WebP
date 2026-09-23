<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>스타일 없는 웹 페이지</title>
</head>
<body>
<h3>CSS 스타일 맛보기</h3>
<hr>
<p>나는 <span>웹 프로그래밍</span>을 좋아합니다.</p>
</body>
</html>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>스타일을 가진 웹 페이지</title>
<style>
body { background-color : mistyrose; }
h3 { color : purple; }
hr { border : 5px solid yellowgreen; }
span { color : blue; font-size : 20px; }
</style>
</head>
<body>
<h3>CSS 스타일 맛보기</h3>
<hr>
<p>나는 <span>웹 프로그래밍</span>을 좋아합니다.</p>
</body>
</html>

 태그에 적용 가능한 스타일
1. 브라우저의 디폴트 스타일
2. 스타일 시트 파일에 선언된 스타일
3. <style></style> 태그에 선언된 스타일
4. style 속성에 선언된 스타일

<!DOCTYPE html>
<html>
<head><meta charset="utf-8">
<title>셀렉터 만들기</title>
<style>
h3, li { /* 태그 이름 셀렉터 */
color : brown;
}
div > div > strong { /* 자식 셀렉터 */
background : yellow;
}
ul strong { /* 자손 셀렉터 */
color : dodgerblue;
}
.warning { /* class 셀렉터 */
color : red;
}
body.main { /* class 셀렉터 */
background : aliceblue;
}
#list { /* id 셀렉터 */
background : mistyrose;
}
#list span{ /* 자손 셀렉터 */
color : forestgreen;
}
h3:first-letter { /* 가상 클래스 셀렉터 */
color : red;
}
li:hover { /* 가상 클래스 셀렉터 */
background : yellowgreen;
}
</style></head>
<body class="main">
<h3>Web Programming</h3>
<hr>
<div>
<div>2학기 <strong>학습 내용</strong>입니다.</div>
<ul id="list">
<li><span>HTML5</span></li>
<li><strong>CSS</strong></li>
<li>JAVASCRIPT</li>
</ul>
<div class="warning">60점 이하는 F</div>
</div>
</body>
</html>
