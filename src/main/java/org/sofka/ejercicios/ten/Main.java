package org.sofka.ejercicios.ten;

import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;

/**
 * class to remove spaces from a sentence
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        try {
            logger.info("Enter a sentence");
            String word = scanner.getString();
            String finalResult = deleteSpace(word);
            logger.info(finalResult);
        } catch (
                MyExeption myExeption) {
            logger.info("invalid option" + myExeption.getMessage());
        }
    }

    /**
     * method that removes spaces from a sentence
     *
     * @param word phrase entered by keyboard
     */
    public static String deleteSpace(String word) {
        return word.replace(" ", "");
    }
}
