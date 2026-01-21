package Laboratorio;

import IOManager.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        sumLeft(array, getHalfArray(array));

        productRight(array, getHalfArray(array));

    }

    public static int getHalfArray(int[] array) {

        int left = 0;

        int right = array.length - 1;

        int centre = 0;

        if (left <= right) {

            centre = (left + right) / 2;
        }

        return centre;
    }

    public static int sumLeft(int[] array, int centrePosition) {

        int total = 0;

        for (int i = 0; i < centrePosition; i++) {

            total += array[i];

        }

        Manager.print("Suma parte izquierda " + total);
        return total;
    }

    public static int productRight(int[] array, int centrePosition) {

        int total = 1;

        for (int i = 1; i < array.length; i++) {

            if (i > centrePosition - 1 - i) {

                total *= array[i];

            }

        }
        Manager.print("Total multiplicacion parte derecha : " + total);

        return total;
    }

}