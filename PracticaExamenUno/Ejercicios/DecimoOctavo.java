public class DecimoOctavo {

    public static void main(String[] args) {

        int[] array = { 1, 9, 2, 8, 3, 4, 6, 7, 5, 0 };

        printArray(bubbleSortedArray(array));

        busquedaBinaria(bubbleSortedArray(array), 0);
    }

    public static void printArray(int[] array) {
        System.err.println("");
        java.util.Arrays.stream(array).forEach(System.out::println);
    }

    public static int[] bubbleSortedArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int variable = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = variable;
                }
            }
        }

        return array;
    }

    public static int centreValue(int[] array) {

        int left = 0;

        int right = array.length - 1;

        int centre = left + right / 2;

        System.out.print("Valor central: " + array[centre] + " En la posicion: " + centre);

        return centre;
    }

    public static int busquedaBinaria(int[] array, int valor) {

        System.err.println("Entro busqueda binaria");

        int left = 0;

        int right = array.length - 1;

        while (left <= right) {

            int centre = left + right / 2;

            if(array[centre] == valor){

                System.out.println("Valor: " + array[centre] + " En la posicion: " + centre);
                return centre;

            }else if (array[centre] < valor) {

                left = centre + 1;

            }else{
                right = centre - 1;
            }
        }

        return -1;
    }
}
