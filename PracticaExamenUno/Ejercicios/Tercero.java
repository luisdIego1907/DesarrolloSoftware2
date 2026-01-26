public class Tercero {

    /*
     * Dado dos arreglos de 10 números enteros cada uno, crea un tercer arreglo
     * de 20 posiciones que combina los elementos de los dos arreglos de forma
     * intercalada. El arreglo resultante debe almacenar primero un elemento del
     * arreglo 1, luego uno del arreglo 2, después nuevamente uno del arreglo 1,
     * seguido de uno del arreglo 2, y así sucesivamente hasta completar el arreglo.
     */
    public static void main(String[] args) {

        int[] a = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };

        int[] b = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        printValues(combination(a, b));
    }

    public static void printValues(int[] array) {
        Manager.print("\nVALORES DEL ARREGLO\n");
        java.util.Arrays.stream(array).forEach(System.out::println);
    }

    public static int[] combination(int[] a, int[] b) {

        int[] array = new int[a.length + b.length];

        int counter = 0;

        for (int i = 0 ; i < array.length; i = i + 2) {
            
            array[i] = a[counter];

            array[i+1] = b[counter];

            counter++;
        }
        return array;
    }
}
