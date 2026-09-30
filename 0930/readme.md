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
