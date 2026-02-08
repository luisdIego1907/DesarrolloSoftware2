
import java.util.Arrays;
import java.util.List;

/*
Crea una excepción ProductoNoEncontradoException.

Crea una clase Inventario con una lista de productos (String).

Implementa el método buscarProducto(String nombre).

Si el producto no existe, lanza la excepción.

Si existe, imprime que fue encontrado. */



public class E3 {

    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();

        try {
            inventario.buscarProducto("algodon"); 

        } catch (ProductoNoEncontradoException e) {
            
            e.printStackTrace();
        }
        

        inventario.buscarProducto("manzana");
    }
}

class ProductoNoEncontradoException extends RuntimeException{

    public ProductoNoEncontradoException(String mensaje){
        super(mensaje);
    }
}

class Inventario{

    private final List<String> listaProductos = Arrays.asList("manzana" , "pera" , "uva" , "fresa" , "limon");

    public void buscarProducto(String nombre){

        if( listaProductos.stream().anyMatch(n -> n.equals(nombre)) ){

            System.out.println("Producto encontrado");
        }else{
            throw new ProductoNoEncontradoException("Producto no encontrado");
        }
    }
}