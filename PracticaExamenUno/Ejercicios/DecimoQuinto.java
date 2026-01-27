public class DecimoQuinto {

    public static void main(String[] args){


        int[] array = {18 , 19 , 20 , 21 , 22 , 23 , 24 , 25 , 26};

        Manager.print(binarySearch(array, 20));
    }

    /*
        Importante, el arreglo debe estar ordenado
     */
    public static int binarySearch(int[] array , int target){

        int left = 0 ;

        int right =  array.length - 1;

        while (left <= right) { 
            
            int middle = left + right /  2;

            if (array[middle] == target) {


                return middle;
                
            } else if (array[middle] < target) {
                
                left = middle + 1;

            } else {

                right = middle - 1;
            }
        }




        return 0;
    }
}
