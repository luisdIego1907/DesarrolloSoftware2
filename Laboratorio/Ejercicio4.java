package Laboratorio;

import IOManager.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        int[] array = { 1, 3, 5, 7, 9 , 2 , 4 , 6 , 8 , 0};

        Manager.print(printArray(bublleSort(array)));

    }

    public static int[] bublleSort(int[] array1 ){

        for(int i = 0 ; i < array1.length ; i++){

            for(int j = 0 ; j < array1.length - 1 - i; j++){

                if(array1[j] < array1[j+1]){

                    int variable = array1[j+1];

                    array1[j+1] = array1[j];

                    array1[j] = variable;
                }
            }
        }

        return array1;
    }

    public static String printArray(int[] array){

        String values = "";

        for(int i = 0 ; i < array.length ; i++){

            values+= array[i] + " ";
        }

        return values;
    }


}
