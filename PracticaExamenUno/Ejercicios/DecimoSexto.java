public class DecimoSexto {

    public static void main(String[] args) {

        int[] array = { 56, 98, 78, 99, 63, 2, 5, 14, 859, 6, 5875, 315, 648, 215, 78899, 3256, 2114, 552, 364, 78, 96,
                654, 123, 258, 47, 9658, 3689, 541, 45 };

        int position = findValuePosition(bubleSort(array), 5);

        Manager.print( position != -1 ? "El valor fue encontrado en la posicion: " + position : "El valor no fue encontrado");
    }

    public static int[] bubleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int variable = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = variable;

                }
            }
        }

        java.util.Arrays.stream(array).forEach(System.out :: println);
        return array;
    }

    public static int findValuePosition(int[] array , int targetValue){

        Manager.print("Entro en findValuePosition");
        int left = 0;

        int right = array.length - 1;

        while (left <= right) { 
            
            int middle = left + right / 2;

            if (array[middle] == targetValue) {
                
                return middle;

            }else if (array[middle] < targetValue) {
                
                left = middle + 1;

            }else{

                right = middle - 1;
            }
        }

        return -1;
    }
}
