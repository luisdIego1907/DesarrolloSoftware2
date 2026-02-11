import type {Movie} from "../models/movie.model";

const MOVIES_URL = "../../Data/movies.json";

export async function getMovies() : Promise<Movie[]>{

    const response = await fetch(MOVIES_URL);

    if(!response.ok){
        throw new Error(
            `No se pudo cargar movies.json (status ${response.status})` ,
        );
    }

    const data = await response.json();

    console.log("Peliculas cargadas" , data);

    return data as Movie[];
}