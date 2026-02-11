import { Link } from "react-router-dom";
import type { Movie } from "../../models/movie.model";

type Props = {movie : Movie};

export default function MovieCard({movie} : Props) {

    return (

         <div className="bg-gray-800 rounded-2xl p-6 shadow-lg hover:scale-105 hover:shadow-2xl transition duration-300 flex flex-col justify-between">
      
      {/* Title */}
      <h2 className="text-xl font-bold mb-3 text-white">
        {movie.title}
      </h2>

      {/* Description */}
      <p className="text-gray-400 text-sm mb-6">
        {movie.description}
      </p>

      {/* Button */}
      <Link
        to={`/movies/${movie.id}`}
        className="mt-auto bg-red-600 hover:bg-red-700 text-center py-2 rounded-lg text-sm font-semibold transition duration-300"
      >
        Ver Detalles
      </Link>

    </div>


    );
}