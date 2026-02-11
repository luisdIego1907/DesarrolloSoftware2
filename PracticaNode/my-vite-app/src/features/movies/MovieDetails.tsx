import { Link, useParams } from "react-router-dom";
/*import type { Movie } from "../../models/movie.model";
import { useState } from "react";*/

export default function MovieDetails(){

    const{id} = useParams<{id : string}>();

    {/*const[movie , setMovie] = useState<Movie | null>(null);*/}
    
    return(
        <div className="min-h-screen bg-gray-900 text-white px-8 py-12">

      <Link
        to="/movies"
        className="inline-block mb-8 text-red-500 hover:text-red-400 transition"
      >
        ← Volver al catálogo
      </Link>

      <div className="bg-gradient-to-r from-gray-800 to-gray-700 rounded-2xl p-10 shadow-xl">

        <h1 className="text-5xl font-bold mb-6">
          🎬 Detalles de la Película
        </h1>

        <div className="space-y-4 text-lg">
          <p>
            <span className="font-semibold text-gray-400">ID:</span> {id}
          </p>

          <p className="text-gray-300">
            Informacion de la peli.
          </p>
        </div>

        {/* Action Buttons */}
        <div className="mt-8 flex gap-4">
          <button className="bg-red-600 hover:bg-red-700 px-6 py-2 rounded-lg font-semibold transition">
            Ver Ahora
          </button>

          <button className="bg-gray-600 hover:bg-gray-500 px-6 py-2 rounded-lg font-semibold transition">
            Agregar a Favoritos
          </button>
        </div>

      </div>

    </div>
    );
}