import Button from "./Button";
import styles from "./App.module.css";
import { useEffect, useState } from "react";
import Movie from "./Movie";
import { BrowserRouter as Router,Switch,Route } from "react-router-dom";
import Detail from "./Detail";
import Home from "./Home";

function App() {
  return(
    <Router>
      <Switch>
        <Route path="abot-us">
          <h2>hello</h2>
        </Route>
        <Route path="/movie/:id">
          <Detail/>
        </Route>
        <Route path="/">
          <Home/>
        </Route>
      </Switch>
    </Router>
  );
}

export default App;
