(실습문제 1) HTML 오류 2개

DOCTYPE 선언 오류: 맨 첫 줄의 <DOCTYPE html>에 느낌표(!)가 누락되었습니다. 올바른 HTML5 선언은 <!DOCTYPE html>입니다.

닫는 태그 누락: <style> 태그를 열었지만 닫는 태그가 없습니다. </head> 바로 윗줄에 </style>을 추가해야 합니다.

CSS 오류 1개

속성 할당 기호 오류: <style> 내부의 span 선택자에서 color = blue; 부분의 등호(=)가 잘못되었습니다. CSS에서는 속성과 값을 콜론(:)으로 구분하므로 color : blue;로 수정해야 합니다.

(실습문제 2) HTML 오류 2개

잘못된 시작 태그: 3번째 줄에 <head> 태그가 있어야 할 자리에 <body> 태그가 잘못 들어가 있습니다. <meta>, <title>, <style>은 <head> 영역에 포함되어야 하며, 아래에 </head> 닫는 태그가 있으므로 3번째 줄을 <head>로 수정해야 합니다.

닫는 태그 오타: <h3>Elvis Presley</h>에서 <h3>로 열었으나 닫는 태그가 </h>로 잘못 작성되었습니다. </h3>로 수정해야 합니다.

CSS 오류 1개

세미콜론 누락: <style> 내부의 h3 선택자에서 text-align : center 뒤에 속성을 구분하는 세미콜론(;)이 빠져있습니다. text-align : center;로 수정해야 합니다.

(실습문제 3) 적용 방법:
기존 test2.html 파일의 <style> ... </style> 부분에 span { color: violet; } 코드를 추가(또는 수정)하고, hr 선택자에 대한 스타일(height: 10px; 등)을 추가한 뒤 저장하고 브라우저에서 새로고침하면 제시된 그림과 동일한 결과를 확인할 수 있습니다.

(실습문제 4) 다음 두 가지 단계를 거쳐 코드를 수정하세요.

이벤트 리스너 이동: 기존 코드에서는 <h3> 태그에 마우스를 올릴 때 show() 함수가 실행되도록 설정되어 있습니다. 이 onmouseover와 onmouseout 속성을 지우고, 본문의 <span>Love Me Tender</span> 태그 안으로 옮깁니다.

출력 이미지 변경: 자바스크립트 <script> 영역의 show() 함수 내부에서 src에 할당된 파일명을 ElvisPresley.png 대신 출력할 자신의 사진 파일명(예: myphoto.png)으로 변경합니다.
