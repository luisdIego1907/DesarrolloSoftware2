
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import { Home } from './features/home/Home'
import { Header } from './shared/Header'
import { Footer } from './shared/Footer'
import { NotFound } from './shared/NotFound'
import Movies from './features/movies/Movies'

function App() {


  return (<BrowserRouter>

    <Header />

    <main>

      <Routes>

        <Route path="/" element={<Home />} />

        <Route path="/home" element={<Home />} />
        
        <Route path="/movies" element={<Movies />} />

        <Route path="*" element={<NotFound />} />
      </Routes>

    </main>

    <Footer />

  </BrowserRouter>)
}

export default App
