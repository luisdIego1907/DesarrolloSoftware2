
public class MyArray {

    private static Object[] array;

    public MyArray(int size){
        array = new Object[size];
    }

    public static Object[] getArray(){
        return array;
    }
    
    public String getValues(){

        String values = "";

        for(Object object : array){

            values+= object.toString() + "\n";
        }

        return values;
    }

    public void addObject(Object object){

        int counter = 0;

        for(int i = 0 ; i < array.length; i++){

            if( array[i] == null){
                
                array[i] = object; 

                counter++;

            }else if(counter == array.length - 1){

                copyArray(object);
            }
        }
        System.out.println("Se agrego el objeto");
    }

    private void copyArray(Object object){

        Object[] newArray = increaseSize();

        for(int i = 0 ; i < array.length; i++){

            newArray[i] = array[i];

        }
        newArray[newArray.length - 1] = object;
    }
    private Object[] increaseSize(){
        return new Object[array.length + 1];
    }

    public int size(){
        return array.length;
    }
}
