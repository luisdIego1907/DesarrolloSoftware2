public class DecimoCuarto {

    public static void main(String[] args) {

        int[] array = { 99, 44, 56, 47, 87, 12, 32, 25, 14, 45, 65, 95, 32, 35, 99, 63, 98, 71, 2, 5, 4, 6, 8, 7, 9, 11,
                22, 26, 59, 89, 78 };

        bubbleSortAscendente(array);

        bubbleSortDescendente(array);
    }

    public static void bubbleSortAscendente(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int v = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = v;
                }
            }
        }

        java.util.Arrays.stream(array).forEach(System.out::println);
    }

    public static void bubbleSortDescendente(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] < array[j + 1]) {

                    int v = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = v;
                }
            }
        }

        java.util.Arrays.stream(array).forEach(System.out::println);
    }
}
