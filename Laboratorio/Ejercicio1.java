package Laboratorio;

import IOManager.*;

public class Ejercicio1 {

    public static void main(String args[]) {

        int[] a = { 1, 2, 3, 4 };

        int[] b = { 5, 6, 7, 8 };

        System.out.println(printArray(createArray(a, b)));

    }

    public static int[] createArray(int[] array1, int[] array2) {

        int[] a = getEvenValues(array1);
        int[] b = getEvenValues(array2);

        int[] evenArray = twoArraysInOne(a, b);

        return evenArray;
    }

    static int[] getEvenValues(int[] array) {
        int[] evenValues = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenValues[i] = array[i];
            }
        }
        return evenValues;
    }

    static int[] twoArraysInOne(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[array1.length + i] = array2[i];
        }

        return newArray;
    }

    public static String printArray(int[] array) {

        String values = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                values += array[i] + " ";
            }

        }

        return values;
    }
}
