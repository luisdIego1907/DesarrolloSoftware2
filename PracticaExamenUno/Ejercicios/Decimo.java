public class Decimo {

    /*
     * Se requiere desarrollar un programa que permita crear e inicializar una
     * matriz
     * cuadrada de tamaño NxN con valores previamente definidos en el código.
     * Una vez inicializada la matriz, el programa debe calcular la suma de los
     * elementos de la diagonal principal y la suma de los elementos de la diagonal
     * inversa. Posteriormente, el sistema deberá calcular la diferencia entre ambas
     * sumas e indicar por pantalla el valor de dicha diferencia, mostrando además
     * las sumas correspondientes a cada diagonal.
     * 
     */
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, 
                            { 4, 5, 6 }, 
                            { 7, 8, 9 } };

        int totalMainDiagonal = mainDiagonal(matrix);

        int totalInverDiagonal = inversDiagonal(matrix);

        Manager.print("Total suma diagonal principal: " + totalMainDiagonal + " Total diagonal inversa: " + totalInverDiagonal + 
        "\nDiferencia entre ellas: " + diference(totalMainDiagonal, totalInverDiagonal));

    }

    public static int mainDiagonal(int[][] matrix) {

        int total = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j) {
                    total += matrix[i][j];
                }
            }
        }

        return total;
    }

    public static int inversDiagonal(int[][] matrix) {

        int total = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i + j == matrix.length - 1) {

                    total += matrix[i][j];
                }
            }
        }

        return total;
    }

    public static int diference(int totalMainDiagonal , int totalInverseDiagonal){

        return totalMainDiagonal - totalInverseDiagonal;
    }
}
