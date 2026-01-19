package Arreglos.Matrices;

import java.security.SecureRandom;

import IOManager.*;

public class Matriz {

    public static void main(String args[]) {

        int[][] matrix = { { 100, 200, 300 }, { 400, 500, 600 }, { 700, 800, 900 } };

        int[][] repetitiveMatrix = { { 19, 19, 19 }, { 1, 2, 3 }, { 7, 7, 7 }, { 4, 5, 6 } };

        // printRow(matriz, 0);

        // printColumn(matriz, 0);

        // Manager.print("Suma diagonal principal es: " +additionMainDiagonal(matrix));

        // printMatrix(matrix);

        // Manager.print("El valor de la diagonal inversa es: " +
        // additionInvers(matrix));

        // printMatrix(repetitiveMatrix);

        // Manager.print(repetetiveRow(repetitiveMatrix, 2) ? "Los valores son iguales"
        // : "Los valores son distintos");

        //int[][] frame = new int[8][6];

       // printMatrix(buildFrame(frame));

       //printMatrix(identity()); // matriz identidad

      // Manager.print(positions(assignRandomValues(), 7));

      int[][] randomMatrix = assignRandomValues();

      printMatrix(randomMatrix);

      //Manager.print("Numero mayor: " + highestValue(randomMatrix));

        Manager.print(additionCorners(randomMatrix));
    }

    public static int additionCorners(int[][] matrix){

        int total = 0;

        for(int i = 0 ; i < matrix.length; i++){

            for(int j = 0 ; j < matrix[i].length; j++){

                if( (i == 0 && j == 0) || (i == matrix.length - 1 && j == matrix[i].length - 1) || (i == matrix.length - 1 && j == 0) || (i == 0 && j == matrix[i].length - 1)){

                    total += matrix[i][j];
                }
            }
        }

        return total;
    }
    public static int highestValue(int[][] matrix){

        int highestValue =  Integer.MIN_VALUE;

        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length ; j++){

                if( matrix[i][j] > highestValue) highestValue = matrix[i][j];
            }
        }

        return highestValue;

    }
    public static String positions(int[][] matrix , int number){

        String positions = "Posicion en donde se repite el numero: " + number + "\n";
        
        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length ; j++){

                if( matrix[i][j] == number){

                    positions+= "Fila: " + i + " Columna: " + j + "\n";
                }
            }
        }

        return positions;
    }

    public static int[][]  assignRandomValues(){

        int[][] matrix = new int[10][10];

        SecureRandom random = new SecureRandom();

        for(int i = 0; i < matrix.length; i++){

            for(int j = 0 ; j< matrix[i].length; j++){

                matrix[i][j] = random.nextInt(10);
            }
        }

        return matrix;
    }

    public static int[][] identity(){

        int[][] matrix = new int[7][7];

        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length; j++){

                if(i == j){

                    matrix[i][j] = 1;
                }else{
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static int[][] buildFrame(int[][] frame) {

        int[][] matrix = frame;

        for (int i = 0; i < frame.length; i++) {

            for (int j = 0; j < frame[i].length; j++) {

                if ((j == 0) || j == frame[i].length - 1 || i == 0 || i == frame.length - 1) {

                    matrix[i][j] = 1;

                } else {

                    matrix[i][j] = 0;
                }

            }

        }

        return matrix;
    }

    public static boolean repetetiveRow(int[][] matrix, int row) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i == row) {

                    return (matrix[row][j] == matrix[row][j + 1] && matrix[row][j] == matrix[row][j + 2]) ? true
                            : false;

                }
            }
        }

        return false;
    }

    public static void printMatrix(int[][] matrix) {

        String values = "";

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                values += matrix[i][j] + " ";

            }

            values += "\n";
        }

        Manager.print(values);

    }

    public static void printRow(int[][] matrix, int row) {

        String values = "";

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i == row) {

                    values += matrix[i][j] + " ";
                }
            }
        }

        Manager.print(values);

    }

    public static void printColumn(int[][] matrix, int column) {

        String values = "";

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (j == column) {

                    values += matrix[i][j] + " ";
                }
            }
        }

        Manager.print(values);
    }

    public static int additionMainDiagonal(int[][] matrix) {

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

    public static int additionInvers(int[][] matrix) {

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
}
