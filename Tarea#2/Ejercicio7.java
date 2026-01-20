public class Ejercicio7 {


    public static void main(String args[]){


        IOManager.print("Digite una palabra");

        String word = IOManager.readString();

        IOManager.print("Plabra del reves: " + WordTransformer.upSideDown(word));
    }

    
}

    class WordTransformer{

        static String upSideDown(String word){

            String newWord = "";

            for(int i = 0 ; i < word.length() ; i++){

                newWord += word.charAt(word.length() - i - 1);
            }

            return newWord;
        }
    }
