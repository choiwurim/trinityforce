const todoForm=document.getElementById("todo-form");
const todoList=document.getElementById("todo-list");
const todoInput=document.querySelector("#todo-form input");
let toDoSave=[];

function handleToDoSubmit(event){
    event.preventDefault();
    const newTodo=todoInput.value;
    todoInput.value="";
    const newToDoObj={
        text:newTodo,
        id:Date.now(),
    };
    toDoSave.push(newToDoObj);
    paintToDo(newToDoObj);
    saveToDo();
}
function deleteToDo(event){
    const li=event.target.parentElement;
    li.remove();
    toDoSave=toDoSave.filter(toDo=>toDo.id!==parseInt(li.id));
    saveToDo();
}
function saveToDo(event){
    localStorage.setItem("todo",JSON.stringify(toDoSave));
}
function paintToDo(newToDo){
    const li=document.createElement("li");
    li.id=newToDo.id;
    const span=document.createElement("span");
    span.innerText=newToDo.text;
    const button=document.createElement("button");
    button.innerText="❌";
    button.addEventListener("click",deleteToDo);
    li.appendChild(span);
    li.appendChild(button);
    todoList.appendChild(li);
}

todoForm.addEventListener("submit",handleToDoSubmit);

const saveToDo=localStorage.getItem("todo");
if(saveToDo !==null){
    const parsedToDoSave=JSON.parse(saveToDo);
    toDoSave=parsedToDoSave;
    parsedToDoSave.foreach(paintToDo);
}

function Filter(){

}
