import type { Movie } from "../../models/movie.model";
import MovieCard from "./MovieCard";


export default function MovieList() {

    const movies: Movie[] = [

        {
            id: "thebatman",
            title: "The Batman",
            description: "Parte 1"
        },
        {
            id: "thedarkknight",
            title: "The Dark Knight",
            description: "Parte 2"
        }
    ];
    return (

        <div className="flex flex-col gap-4">
            {movies.map(movie => (
                <MovieCard key={movie.id} {...movie} />
            ))}
        </div>
    );
}