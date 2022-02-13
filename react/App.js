import Button from "./Button";
import styles from "./App.module.css";
import { useEffect, useState } from "react";
function App() {
  const [count, setValue]=useState(0);
  const [keyword, setKeyword]=useState("");
  const onClick=()=>setValue((cur)=>cur+1);
  const onChange=(event)=>setKeyword(event.target.value);
  const iRunOnlyOnce=()=>{
    console.log("i run");
  };
  useEffect(()=>{
    console.log("CALL the api");
  },[]);
  useEffect(()=>{
    if(keyword!=="" && keyword.length>5){
      console.log("Search for",keyword);  
    }
  },[keyword]);
  return (
    <div>
      <input onChange={onChange} type="text" placeholder="Search"/>
      <h1>{count}</h1>
      <button onClick={onClick}>Click</button>;
    </div>
  );
}

export default App;
