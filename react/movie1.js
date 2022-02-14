import { useEffect, useState } from "react";

function movie1() {
  const [load,setLoad]=useState(true);
  const [movies,setMovie]=useState([]);
  const getMovie=async()=>{
    const json=await(
      await fetch(
        `https://yts.mx/api/v2/list_movies.json?minimum_rating=9.8&sort_by=year`
      )
    ).json();
    setMovie(json.data.movies);
    setLoad(false);
  }
  useEffect(()=>{
    getMovie();
  },[])
  return (
    <div>
      {load ? (
        <h1><strong>Loading...</strong></h1>
      ):(
        <div>
          {movies.map((movie)=>(
            <div key={movie.id}>
              <img src={movie.medium_cover_image}/>
              <h3>{movie.title}</h3>
              <p>{movie.summary}</p>
              <ul>
                {movie.genres.map((g)=>(
                  <li key={g}>{g}</li>
                ))}
              </ul>
            </div>
          ))}
        </div>
      )}
    </div>
  );
}

export default movie1;
