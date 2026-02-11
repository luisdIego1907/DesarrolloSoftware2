import { Link } from "react-router-dom";

export function Home() {

    return (

        <div className="min-h-screen bg-gray-900 text-white">

            {/* Hero Section */}
            <section className="relative h-[70vh] flex items-center justify-center bg-gradient-to-r from-black via-gray-900 to-black">
                <div className="text-center px-6">
                    <h1 className="text-5xl md:text-6xl font-bold mb-6">
                        🎬 MovieStream
                    </h1>
                    <p className="text-lg md:text-xl text-gray-300 mb-8">
                        Descubre las mejores películas en un solo lugar
                    </p>

                    <Link
                        to="/movies"
                        className="inline-block bg-red-600 hover:bg-red-700 px-6 py-3 rounded-lg text-lg font-semibold transition duration-300"
                    >
                        Explorar Películas
                    </Link>

                </div>
            </section>


            {/* Featured Section */}
            <section className="px-8 py-16">
                <h2 className="text-3xl font-bold mb-8">🔥 Películas Destacadas</h2>

                <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-6">

                    {/* Card 1 */}
                    <div className="bg-gray-800 rounded-xl p-4 hover:scale-105 transition transform duration-300 shadow-lg">
                        <h3 className="text-xl font-semibold mb-2">Inception</h3>
                        <p className="text-gray-400 text-sm">
                            Un viaje dentro de los sueños que desafía la realidad.
                        </p>
                    </div>

                    {/* Card 2 */}
                    <div className="bg-gray-800 rounded-xl p-4 hover:scale-105 transition transform duration-300 shadow-lg">
                        <h3 className="text-xl font-semibold mb-2">Interstellar</h3>
                        <p className="text-gray-400 text-sm">
                            Exploración espacial para salvar a la humanidad.
                        </p>
                    </div>

                    {/* Card 3 */}
                    <div className="bg-gray-800 rounded-xl p-4 hover:scale-105 transition transform duration-300 shadow-lg">
                        <h3 className="text-xl font-semibold mb-2">The Batman</h3>
                        <p className="text-gray-400 text-sm">
                            El caballero oscuro enfrenta nuevos enemigos en Gotham.
                        </p>
                    </div>

                    {/* Card 4 */}
                    <div className="bg-gray-800 rounded-xl p-4 hover:scale-105 transition transform duration-300 shadow-lg">
                        <h3 className="text-xl font-semibold mb-2">Avatar</h3>
                        <p className="text-gray-400 text-sm">
                            Una aventura épica en el planeta Pandora.
                        </p>
                    </div>

                </div>
            </section>

        </div>
    );
}