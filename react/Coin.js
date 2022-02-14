import { useEffect, useState } from "react";

function Coin() {
  const [load, setLoad]=useState(true);
  const[coin,setCoin]=useState([]);
  useEffect(()=>{
    fetch("https://api.coinpaprika.com/v1/tickers")
    .then((response)=>response.json())
    .then((json)=>{
      setCoin(json);
      setLoad(false);
    });
  },[]);
  return (
    <div>
      <h1>The coin({coin.length})</h1>
      {load?<string>Loading</string>:null}
      <select>
        {coin.map((coins)=>(
          <option>
            {coins.name}({coins.symbol}):${coins.quotes.USD.price} USD
          </option>
        ))};
      </select>
    </div>
  );
}

export default Coin;
