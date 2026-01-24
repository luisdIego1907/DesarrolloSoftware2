import IOManager.Manager;

public class Ejercicio3 {
    /*Dado un arreglo de números enteros, se debe encontrar el valor más alto presente
en el arreglo y determinar cuántas veces se repite dicho valor utilizando un contador.
Requerimientos:
● Recorrer el arreglo para identificar el valor máximo.
● Utilizar un contador para registrar cuántas veces aparece el valor máximo.
● Mostrar el valor máximo y la cantidad de repeticiones.
 */
    public static void main(String[] args){

        int[] array = {9,5,1,9,8,4,9,6,2,3,7,8,9,9,9,1,4,5,9,3};

        Manager.print("Numero mas alto: " + highestNumber(array) + "\nVeces que aparece: "+ repetedAmount(array) );
    }

    public static int highestNumber(int[] array){

        int highestNumber = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){

            if(array[i] > highestNumber){

                highestNumber = array[i];
            }
        }

        return highestNumber;
    }

    public static int repetedAmount(int[] array){

        int total = 0;

        int highestNumber = highestNumber(array);

        for(int i = 0 ; i < array.length; i++){

            if(array[i] == highestNumber) total++;
        }

        return total;
    }
}
