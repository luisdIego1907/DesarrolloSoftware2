
public class Segundo {

    /*
     * Leer 5 números por teclado y a continuación realizar la media de los números
     * positivos, contar los negativos y contar el número de ceros, y luego mostrar
     * la
     * información que se obtuvo, la media de los positivos, cuántos negativos y
     * cuántos 0 .
     */
    public static void main(String[] args) {

        int[] array = values();

        Manager.print("La media de los numeros positivos es: " + positiveNumbersMedia(array)
                    +"\nLa cantidad de numeros negativos es: " + negativeNubers(array) 
                    +"\nLa cantidad de ceros es: " + ceros(array));
    }

    public static int[] values() {

        int[] array = new int[5];

        int value = 0;

        for (int i = 0; i < array.length; i++) {

            Manager.print("Digite un numero");

            value = Manager.readInt();

            array[i] = value;
        }

        return array;
    }

    public static long positiveNumbersMedia(int[] array){

        int sum = java.util.Arrays.stream(array).filter(n -> n > 0).sum();

        long amount = java.util.Arrays.stream(array).filter(n -> n > 0).count();

       return sum / amount;
    }

    public static long negativeNubers(int[] array){
        
        long amount = java.util.Arrays.stream(array).filter( n -> n < 0).count();

        return amount;
    }

    public static long ceros(int[] array){

        long amount = java.util.Arrays.stream(array).filter(n -> n == 0).count();

        return amount;
    }

}
