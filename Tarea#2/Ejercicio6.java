public class Ejercicio6 {

    public static void main(String args[]) {

        IOManager.print("Digite una frase ");

        String sentence = IOManager.readString();

        IOManager.print("Cantidad vocales: " + VowelCounter.vowels(sentence));
    }

}

class VowelCounter {

    static int vowels(String sentence) {

        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (isVowel(sentence.charAt(i))) counter++;

        }

        return counter;
    }

    static boolean isVowel(Character letter) {

        return letter.equals('a') || letter.equals('e') || letter.equals('i') || letter.equals('o')
                || letter.equals('u');

    }
}
