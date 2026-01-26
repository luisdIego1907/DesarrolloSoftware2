
import java.util.Arrays;
import java.util.Comparator;

public class Quinto {

    /*
     * Dado un arreglo de 10 elementos de tipo String, desarrolle una aplicación que
     * determine si las palabras almacenadas en el arreglo se encuentran
     * ordenadas alfabéticamente de forma ascendente, ordenadas alfabéticamente
     * de forma descendente o si se encuentran desordenadas. Use compareTo y
     * recuerde que este método devuelve positivo si la palabra es mayor (b > a) y
     * negativo si la palabra es menor( a < b).
     * 
     */
    public static void main(String[] args) {

        
        String[] words = {"cangrejo" , "arroz" , "atun" , "batido" , "hermano" , "caja"};

        
        Arrays.sort(words , new Compa());

        for (Object elem : words) {
            System.out.println(elem);
        }
    }

}

 class Compa implements Comparator<String>{


    @Override
    public int compare(String a , String b){

        return Integer.compare(firstLetterPosition(a), firstLetterPosition(b));
    }

    Character[] abecedario = {'a' , 'b' ,'c' ,'d' , 'e' ,'f','g','h','i','j','k','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public int firstLetterPosition(String word){


        char firstLetterPosition = Character.toLowerCase(word.charAt(0));

        return java.util.stream.IntStream.range(0, abecedario.length)
            .filter(i -> abecedario[i] == firstLetterPosition).findFirst().orElse(-1);
    }

}
