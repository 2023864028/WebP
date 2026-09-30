## 9/30 수업내용

display : block
예 : <span>을 블록 박스로 수정

span {
display : block;
width : 100px;
height : 60px;
}
<div>
<span>block span</span>과
<span>block span</span>입니다.
</div>

display : inline-block
예 : <div>를 인라인 블록 박스로 수정

div div {
display : inline-block;
border : 2px dotted orangered ;
background : powderblue;
margin : 10px;
width : 60px; height : 80px;
}
<div style="background : orange">
<div>inline-block DIV</div>
<div>inline-block DIV</div>
<div>inline-block DIV</div>
</div>

display : inline
예 : <div>를 인라인 박스로 수정

div div {
display : inline;
}
<div style="background : orange">
<div>inline DIV</div>
<div>inline DIV</div>
<div>inline DIV</div>
</div>

<!DOCTYPE html>
<html>
<head><meta charset="utf-8">
<title>relative 배치</title>
<style>
div {
display : inline-block;
height : 50px;
width : 50px;
border : 1px solid lightgray;
text-align : center;
color : white;
background : red;
}
#down:hover {
position : relative;
left : 20px;
top : 20px;
background : green;
}
#up:hover {
position : relative;
right : 20px;
bottom : 20px;
background : green;
}
</style>
</head>
<body>
    <h3>상대 배치, relative</h3>
    h와 k 글자에 마우스를 올려 보세요
    <hr>
    <div>T</div>
    <div id="down">h</div>
    <div >a</div>
    <div>n</div>
    <div id="up">k</div>
    <div>s</div>
    </body>
    </html>
