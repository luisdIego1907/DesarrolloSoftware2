public class DecimoTercero {
    /*
     */
    public static void main(String[] args){

        Libro[] libros = new Libro[5];

        GestorLibros gestor = new GestorLibros(libros);

        gestor.agregarLibro("123", "La marmota y el rator", "Mi tio", 666);

        gestor.agregarLibro("456", "El dinosaurio y la liebre", " Mi otro tio", 789);

        gestor.imprimirLibros();
    }
}
class GestorLibros{

    private Libro[] libros;

    public GestorLibros(Libro[] libros){
        this.libros = libros;
    }

    public void imprimirLibros(){
        java.util.Arrays.stream(libros).forEach(System.out :: println);
    }

    public boolean agregarLibro(String isbn , String titulo , String autor , int numPaginas){

        Libro libro = new Libro(isbn, titulo, autor, numPaginas);

        for (int i = 0 ; i < libros.length ; i++) {
            
            if (libros[i] == null) {

                libros[i] = libro;

                return true;
            }
        }

        return false;
    }
}
class Libro{

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(){

    }

    public Libro(String isbn  ,String titulo ,String autor , int numPaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString(){
        return "El libro con ISBN " + isbn + ", creado por el autor " + autor + ", tiene " + numPaginas + " paginas.";
    }

    public String getISBN(){
        return this.isbn;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getNumeroPaginas(){
        return this.numPaginas;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setNumeroPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
}


