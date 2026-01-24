import IOManager.*;

public class Ejercicio2 {
/*Dado un arreglo de enteros con tamaño impar, se debe dividir el arreglo en dos
partes tomando como referencia el elemento central.
● Los números que se encuentran a la izquierda del elemento central deben
sumarse.
● Los números que se encuentran a la derecha del elemento central deben
multiplicarse.
● El elemento central debe incluirse en ambas operaciones.
 */
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9};

        Manager.print(getMiddle(array));

        Manager.print("Sumatoria valores izquierda: " + lefSum(array));

        Manager.print("Producto valores derecha: " + righProduct(array));
    }

    public static int getMiddle(int[] array){

        return array.length / 2;
    }

    public static int lefSum(int[] array){

        int total = 0;

        for(int i = 0 ; i <= getMiddle(array); i++){
            
            total+= array[i];
        }

        return total;
    }

    public static int righProduct(int[] array){

        int total = 1;

        for(int i = getMiddle(array); i < array.length; i++){

            Manager.print("Valor multi derecha: " + array[i]);
            total*= array[i];
        }
        return total;
    }
}
