import { Link } from "react-router-dom";

export function Header(){

    return(

         <header className="bg-gray-950 text-white shadow-md sticky top-0 z-50">
      <nav className="container mx-auto px-6 py-4 flex items-center justify-between">
        
        <Link 
          to="/" 
          className="text-2xl font-bold text-red-600 hover:scale-105 transition"
        >
          🎬 MovieStream
        </Link>


        <div className="flex items-center gap-6">
          <Link 
            to="/" 
            className="hover:text-red-500 transition duration-300"
          >
            Home
          </Link>

          <Link 
            to="/movies" 
            className="hover:text-red-500 transition duration-300"
          >
            Movies
          </Link>
        </div>

        <div className="flex items-center gap-4">
          <input
            type="text"
            placeholder="Buscar..."
            className="px-3 py-1 rounded-lg bg-gray-800 text-sm focus:outline-none focus:ring-2 focus:ring-red-600"
          />

          <button className="bg-red-600 hover:bg-red-700 px-4 py-1 rounded-lg text-sm font-semibold transition duration-300">
            Login
          </button>
        </div>

      </nav>
    </header>
     
    );
}

   {/*<div className="flex gap-4">
            <a href="/">Header</a>
            
            <a href="/movies">Movies</a>
        </div>*/}
