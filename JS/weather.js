const API_KEY="d2364fd04689225a7e6bab1968bd222d"
function onGeo(){
    const lat=position.coords.latitude;
    const lon=position.coords.longitude;
    console.log("You live in",lat,lng);
    const url=`https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=d2364fd04689225a7e6bab1968bd222d=${API_KEY}`;
    fetch(url).then((Response)=>Response.json()).then((data)=>
    {const weather=document.querySelector("#weather span:first-child");
    const city=document.querySelector("#weather span:last-child");
    city.innerText=data.name; 
    weather.innerText=data.weather[0].main});

}
function onGeoError(){
    alert("Can't find.");
}
navigator.geolocation.getCurrentPosition(onGeo,onGeoError);


