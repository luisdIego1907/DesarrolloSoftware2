import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class PRUEBA {

    public static void main(String args[]) {

        List<Integer> lista = Arrays.asList(1, 2, null , 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 , null);

        // IOManager.print(sumatoria(5,6,7,8,9,14,2,3,1,4,5,4));

        // int[] array = {1,2,3,4,5,6,7,8,9};

        // java.util.Arrays.stream(array).forEach(value -> System.out.print(value));

        lista.stream()
            .filter( n -> n != null)
            .mapToInt(Integer:: intValue) //MethodReference
            .filter( n -> n > 5)
           // .peek( n -> System.out.println("Despues del filtro: " + n ) )
            .map( n -> n * 2)
            //.peek("Despues de la multiplicacion: " + n)
            .forEach(System.out:: println); //method reference

    }

    public static int sumatoria(int... valores) {

        return java.util.Arrays.stream(valores).sum();
    }

}
