const loginInput=document.querySelector("#login-form input");
const loginForm=document.querySelector("#login-form");
const greeting=document.querySelector("#greeting");
const HIDDEN_classname="hidden";
const savedUserName=localStorage.getItem("userName");

function handleLoginSubmit(event){
    event.preventDefault();
    const userName=loginInput.value;
    localStorage.setItem("userName",userName);
    loginForm.classList.add(HIDDEN_classname);
    paintGreeting(userName);
}
function paintGreeting(){
    greeting.innerText="Hello"+userName;
    greeting.classList.remove(HIDDEN_classname);
}
loginForm.addEventListener("submit", handleLoginSubmit);

if(savedUserName===null){
    // show the form
    loginForm.addEventListener("submit",handleLoginSubmit);
    loginForm.classList.remove(HIDDEN_classname);
}else{
    // show the h1
    paintGreeting(saveduserName);
}
