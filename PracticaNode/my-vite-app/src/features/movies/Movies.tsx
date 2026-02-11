import { useEffect, useState } from "react";
import MovieList from "./MoviesList";
import { getMovies } from "../../service/movies.service";
import type { Movie } from "../../models/movie.model";

export default function Movies() {

    const [movies, setMovies] = useState<Movie[]>([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {

        getMovies()
            .then(setMovies)
            .finally(() => setLoading(false));
    }, []);

    if (loading)

        return (

            <div className="min-h-screen bg-gray-900 flex flex-col items-center justify-center text-white">

                {/* Spinner */}
                <div className="w-12 h-12 border-4 border-red-600 border-t-transparent rounded-full animate-spin mb-6"></div>

                <p className="text-lg text-gray-300">
                    Cargando películas...
                </p>
            </div>
        );

    return (
        <div >
            <div className="min-h-screen bg-gray-900 text-white px-8 py-12">

                {/* Header Section */}
                <div className="mb-12 text-center">
                    <h1 className="text-5xl font-bold mb-4">
                        🎬 Catálogo de Películas
                    </h1>
                    <p className="text-gray-400 text-lg">
                        Descubre nuestras mejores selecciones
                    </p>
                </div>

                {/* Movie List */}
                <MovieList movies={movies} />

            </div>
        </div>
    );
}

