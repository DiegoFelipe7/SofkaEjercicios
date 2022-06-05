package org.sofka.ejercicios.ejercicio11;
import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;

/**
 * class to determine the number of vowels in a sentence
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();
    public static void main(String[] args) {
        try{
            logger.info("Enter a sentence");
            String words = scanner.getString();
            vowels(words);
        }catch (MyExeption myExeption){
            logger.info("invalid option"+myExeption.getMessage());
        }
    }

    /**
     *method to determine the number of vowels in a sentence
     *
     * @param words phrase entered by keyboard
     */
    public static void vowels(String words) {
        int a=0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int error=0;
        String word = words.toUpperCase();
        for (int j = 0; j < word.length(); j++) {
            switch (String.valueOf(word.charAt(j))) {
                case "A" -> a=a+1;
                case "E" -> e = e + 1;
                case "I" -> i = i + 1;
                case "O" -> o = o + 1;
                case "U" -> u = u + 1;
                default -> error=error+1;
            }
        }
        int finalA = a;
        logger.info("number of letters A "+ finalA);
        int finalB = e;
        logger.info("number of letters E "+ finalB);
        int finalI = i;
        logger.info("number of letters I "+ finalI);
        int finalO = o;
        logger.info("number of letters O "+ finalO);
        int finalU = u;
        logger.info("number of letters U "+ finalU);

    }

}
