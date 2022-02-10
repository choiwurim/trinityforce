const quotes=[{
    quote:"시간이 얼마나 있는지는 상관 없어. 어떻게 쓰느냐가 중요하지",
    author:"에코",
},
{
    quote:"삶과 죽음의 순환은 계속된다. 우리는 살 것이고, 저들은 죽을 것이다",
    author:"나서스",
},
{
    quote:"내 검과 심장은 데마시아의 것이다!",
    author:"가렌"
}]
const quote=document.querySelector("#quote span:first-child");
const author=document.querySelector("#quote span:last-child");
const todayQuote=quotes[Math.floor(Math.random()*quotes.length)];
quote.innerText=todayQuote.quote;
author.innerText=todayQuote.author;
