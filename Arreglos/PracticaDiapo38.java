package Arreglos;

public class PracticaDiapo38 {

    public static void main(String[] args) {

        int[] numeros = { 100, 200, 500, 600, 700, 1000, 250, 9999, 45, 36 , 100 , 100};
        /*
         * IOManager.Manager.print("Arreglo Original:\n" + imprimirArreglo(numeros));
         * 
         * IOManager.Manager.print("Numero mayor " + highestNumber(numeros));
         * 
         * IOManager.Manager.print("Cuadrados\n" + imprimirArreglo(square(numeros)));
         * 
         * IOManager.Manager.print("Numero menor " + lowestNumber(numeros));
         * 
         * IOManager.Manager.print("Suma: " + suma(numeros));
         * 
         * 
         * IOManager.Manager.print("Segundo Mayor: " + secondHighest(numeros));
         * 
         * IOManager.Manager.print("Promedio " + promedio(numeros));
         * 
         * IOManager.Manager.print(cantParesImpares(numeros));
         

        IOManager.Manager.print(isIN(numeros, 0) ? "Esta" : "No ta");

        IOManager.Manager.print("Arreglo del reves: " + reves(numeros));

        */

        IOManager.Manager.print("Numero de veces que aparece el numero: " +cuantavasVecesEsta(numeros, 100));

    }

    static int cuantavasVecesEsta(int[] arreglo , int num){

        int cant = 0;

        for(int i = 0; i < arreglo.length ; i++){

            if( arreglo[i] == num){

                cant++;
            }
        }

        return cant;
    }

    static String reves(int[] num) {

        String arreglo = "";

        for (int i = num.length - 1; i > -1; i--) {

            arreglo += num[i] + " ";
        }

        return arreglo;
    }

    static boolean isIN(int[] arreglo, int num) {

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == num) {

                return true;
            }
        }

        return false;
    }

    static String cantParesImpares(int[] arreglo) {

        int pares = 0;

        int impares = 0;

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] % 2 == 0) {

                pares++;
            } else {
                impares++;
            }
        }

        return "Pares: " + pares + " Impares: " + impares;
    }

    static double promedio(int[] numeros) {

        double promedio = 0.0;

        for (int i = 0; i < numeros.length; i++) {

            promedio += numeros[i];
        }

        promedio = promedio / numeros.length;

        return promedio;
    }

    static int secondHighest(int[] num) {

        int mayorValor = Integer.MIN_VALUE;

        int second = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > mayorValor) {

                second = mayorValor;

                mayorValor = num[i];

            }

        }

        return second;
    }

    static int suma(int[] arreglo) {

        int total = 0;

        for (int i = 0; i < arreglo.length; i++) {

            total += arreglo[i];
        }

        return total;
    }

    static int lowestNumber(int[] arreglo) {

        int lowestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] < lowestNumber) {

                lowestNumber = arreglo[i];
            }

        }

        return lowestNumber;
    }

    static String imprimirArreglo(int[] arreglo) {

        String valores = "";

        for (int i = 0; i < arreglo.length; i++) {

            valores += arreglo[i] + " ";

        }

        return valores;
    }

    static int highestNumber(int[] num) {

        int mayorValor = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > mayorValor) {

                mayorValor = num[i];
            }

        }

        return mayorValor;
    }

    static int[] square(int[] num) {

        int[] cuadrado = new int[num.length];

        for (int i = 0; i < num.length; i++) {

            cuadrado[i] = num[i] * num[i];
        }

        return cuadrado;
    }
}
