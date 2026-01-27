public class Duodecimo {

    /*
     * Se requiere desarrollar una aplicación en Java para la gestión básica de
     * productos de una tienda. Para ello, se debe crear una clase Producto, cuya
     * única responsabilidad sea representar un producto, incluyendo los atributos
     * nombre y precio. Asimismo, se debe implementar una clase de servicio que
     * contenga un método estático encargado de realizar la búsqueda de un
     * producto dentro de un arreglo de productos, a partir de su nombre. Este
     * método debe encargarse únicamente de la lógica de búsqueda, sin realizar
     * operaciones de entrada o salida. Finalmente, desde la clase principal se debe
     * crear un arreglo con al menos tres productos, solicitar el nombre del
     * producto
     * a buscar e invocar el método correspondiente para mostrar el resultado por
     * pantalla.
     * 
     */

    public static void main(String[] args){

        Producto[] productos = {new Producto("Zapatos", 150.55) , new Producto("Tennis", 220.13),
            new Producto("Faja", 35.60) , new Producto("Sombrero", 79.99)
        };

        Manager.print(Servicio.busquedaProductoPorNombre("Zapatos", productos) ? "Se encontro en la lista" : "No se encontro en la lista");
    }
}

class Producto{

    private String nombre;
    private double precio;

    public Producto(){

    }

    public Producto(String nombre , double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }
}

class Servicio{

    
    public static boolean busquedaProductoPorNombre(String nombre , Producto[] productos){

       return  java.util.Arrays.stream(productos).anyMatch(n -> n.getNombre().equals(nombre));
    }
}