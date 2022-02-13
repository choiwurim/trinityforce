import Button from "./Button";
import styles from "./App.module.css";
import { useEffect, useState } from "react";

function App() {
  const [todo, settodo]=useState("");
  const [todos, settodos]=useState([]);
  const onChange=(event)=>settodo(event.target.value);
  const onSubmit=(event)=>{
    event.preventDefault();
    if(todo===""){
      return;
    }
    settodos(cur=>[todo,...cur]);
    settodo("");
  };
  return (
    <div>
      <h1>My To Do({todos.length})</h1>
      <form onSubmit={onSubmit}>
        <input onChange={onChange}
        type="text" 
        placeholder="Write:To do today..">
        </input>
        <button>Add To Do</button>
      </form>
      <hr />
      <ul>
        {todos.map((item)=> <li>{item}</li>)};
      </ul>
    </div>
  );
}

export default App;
