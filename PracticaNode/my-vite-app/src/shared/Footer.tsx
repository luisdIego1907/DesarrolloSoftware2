import { Link } from "react-router-dom";

export function Footer() {
  return (
    <footer className="bg-gray-950 text-gray-400 mt-20">
      
      <div className="container mx-auto px-8 py-12 grid grid-cols-1 md:grid-cols-3 gap-8">
        
       
        <div>
          <h2 className="text-2xl font-bold text-red-600 mb-4">
            🎬 MovieStream
          </h2>
          <p className="text-sm leading-relaxed">
            Tu plataforma favorita para descubrir y explorar las mejores
            películas en un solo lugar.
          </p>
        </div>

        <div>
          <h3 className="text-white font-semibold mb-4">Navegación</h3>
          <ul className="space-y-2">
            <li>
              <Link to="/" className="hover:text-red-500 transition">
                Home
              </Link>
            </li>
            <li>
              <Link to="/movies" className="hover:text-red-500 transition">
                Movies
              </Link>
            </li>
          </ul>
        </div>

        <div>
          <h3 className="text-white font-semibold mb-4">Síguenos</h3>
          <div className="flex gap-4 text-sm">
            <a href="#" className="hover:text-red-500 transition">
              Facebook
            </a>
            <a href="#" className="hover:text-red-500 transition">
              Instagram
            </a>
            <a href="#" className="hover:text-red-500 transition">
              Twitter
            </a>
          </div>
        </div>

      </div>

      {/* Bottom Bar */}
      <div className="border-t border-gray-800 py-6 text-center text-sm">
        © {new Date().getFullYear()} MovieStream. Todos los derechos reservados.
      </div>

    </footer>
  );
}
