import {useEffect,useState} from "react";
import Movie from "./Movie";
function Home(){
    const [load,Setload]=useState(true);
    const [movies,Setmovie]=useState([]);
    const getMovie=async()=>{
        const json=await(
            await fetch(
                `https://yts.mx/api/v2/list_movies.json?minimum_rating=9.5&sort_by=year`
            )
        ).json();
        Setmovie(json.data.movies);
        Setload(false);
    };
    useEffect(()=>{
        getMovie();
    },[]);
    return(
        <div>
            {load ? (
                <h1>Loading...</h1>
            ):(
                <div>
                    {movies.map((movie)=>(
                        <Movie key={movie.id} id={movie.id} coverImg={movie.medium_cover_image} title={movie.title} summary={movie.summary} genres={movie.genres}/>
                    ))}
                </div>
            )}
        </div>
    )
}
export default Home;