package Laboratorio;

import IOManager.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 6, 4, 5, 6, 4, 2, 6 };

        repetition(array, findHighestValue(array));
    }

    public static int findHighestValue(int[] array) {

        int highestValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > highestValue) {

                highestValue = array[i];
            }
        }

        System.out.println("El valor más alto es " + highestValue);

        return highestValue;
    }

    public static void repetition(int[] array , int highestValue){

        int count = 0;

        for(int i = 0 ; i < array.length ; i++){

            if(array[i] == highestValue){

                count++;
            }
        }

        Manager.print("La cantidad de veces que se repite el valor más alto es: " + count);

    }
}