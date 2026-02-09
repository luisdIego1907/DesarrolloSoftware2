import type { Movie } from "../../models/movie.model";

export default function MovieCard(props: Movie){

    return(

        <div>
            <p>Titulo: {props.title}</p>
            <p>Descripcion: {props.description}</p>
        </div>

    );
}