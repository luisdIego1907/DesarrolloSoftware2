public class Cuarto {

    /*
     * Leer los datos correspondientes a dos arreglos de 12 elementos numéricos
     * cada una. A partir de ellos, crear una tercer arreglo de 24 elementos, en la
     * cual se mezclan los valores de los arreglos de la siguiente forma: se deben
     * almacenar tres elementos consecutivos del arreglo 1, seguidos de tres
     * elementos consecutivos del arreglo 2, repitiendo este proceso hasta
     * completar el arreglo 3
     */
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        int[] b = { 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };

        printValues(combination(a, b));
    }

    public static void printValues(int[] array) {

        Manager.print("Valores del arreglo:\n");
        java.util.Arrays.stream(array).forEach(System.out::println);
    }

    public static int[] combination(int[] a, int[] b) {

        int[] array = new int[a.length + b.length];

        int counterA = 0; // la posicion del valor de los arreglos
        int counterB = 0;

        /*
         * El error que tenia es que i solo avanzaba una posicion cuando en realidad
         * tenia que avanzar 6.
         */
        for (int i = 0; i < array.length; i = i + 6) {

            for (int j = 0; j < 3; j++) {

                array[i + j] = a[counterA];

                // Manager.print("Valor de i + j: " + i+j + " Valor de counterA: " + counterA +
                // " Valor i: " + i );

                counterA++;

            }

            for (int k = 3; k < 6; k++) {

                array[i + k] = b[counterB];

                // Manager.print("Valor de i + k: " + i+k + " Valor de counterB: " + counterB +
                // " Valor i: " + i);

                counterB++;

            }
            // Manager.print("");
        }

        return array;
    }
}
