public class Noveno {

    /*
     * Verificar si la suma total de todas las filas de una matriz cuadrada es
     * igual a
     * la suma total de todas las columnas.
     */
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
    }

    public static int sumaColumnas(int[][] matrix) {

        int total = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                total += matrix[i][j];
            }
        }

        return total;
    }

    
}
