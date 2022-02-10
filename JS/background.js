const images=[
    "가렌.jpg",
    "나서스.jpg",
    "에코.jpg"
]
const chosenImg=images[Math.floor(Math.random()*images.length)];
const bgImg=document.createElement("img");
bgImg.src=`img/${chosenImg}`;
document.body.appendChild(bgImg);
