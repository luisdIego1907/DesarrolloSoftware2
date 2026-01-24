import IOManager.Manager;

public class Ejercicio4 {

    public static void main(String[] args) {

        int[] array = { 1, 5, 9, 8, 7, 6, 3, 4, 14, 10, 4, 1, 20, 19, 15, 1, 5, 6, 7, 21 };

        Manager.print(getArrayValues(bubbleSortA(array)));

        Manager.print(getArrayValues(bubbleSortD(array)));

    }

    public static int[] bubbleSortA(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int variable = array[j + 1];

                    array[j + 1] = array[j];

                    array[j] = variable;
                }
            }
        }

        return array;
    }

    public static int[] bubbleSortD(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] < array[j + 1]) {

                    int variable = array[j + 1];

                    array[j + 1] = array[j];

                    array[j] = variable;
                }
            }
        }

        return array;

    }

    public static String getArrayValues(int[] array) {

        String values = "";

        for (int i = 0; i < array.length; i++) {

            values += array[i] + " ";
        }

        return values;
    }
}
