function addAnswer(obj, text) {
    let parentDiv = obj.parentElement;      
    let newP = document.createElement("p"); 
    newP.innerHTML = text;                  
    
    // 생성된 <p> 태그를 클릭하면 삭제되는 이벤트 추가
    newP.onclick = function() {
        parentDiv.removeChild(this); // 부모 요소에서 클릭된 자기 자신(this)을 삭제
    };
    
    parentDiv.appendChild(newP);            
}
