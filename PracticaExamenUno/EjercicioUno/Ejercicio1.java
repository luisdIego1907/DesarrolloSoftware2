import IOManager.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 6, 7, 8, 9 , 0 };

        int[] evenNumber = new int[getEvenAmount(a) + getEvenAmount(b)];

        printValues(bubbleSort(assingValues(evenNumber, a, b)));
    }

    public static int getEvenAmount(int[] array) {

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                counter++;
            }
        }

        return counter;
    }

    public static int[] assingValues(int[] evenNumber, int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {

            if (evenNumber[i] == 0) {

                if (a[i] % 2 == 0) {

                    evenNumber[i] = a[i];

                } else if (b[i] % 2 == 0) {
                    evenNumber[i] = b[i];
                }

            }
        }

        return evenNumber;
    }

    public static void printValues(int[] array){

        String values = "";

        for(int i = 0 ; i < array.length ; i++){

            values+= array[i] + " ";
        }

        Manager.print(values);
    }

    public static int[] bubbleSort(int[] array){

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array.length - 1 - i; j++){

                if(array[j] > array[j+1]){

                    int variable = array[j];

                    array[j] = array[j+1];

                    array[j+1] = variable;
                }
            }
        }
        return array;
    }
}
