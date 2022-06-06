package org.sofka.ejercicios.twelve;

import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;
import java.util.ArrayList;

/**
 * class to determine the differences between two words
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        try {
            logger.info("enter your first sentence");
            String firstSentence = scanner.getString();
            logger.info("enter your second sentence");
            String secondSentence = scanner.getString();
            compare(firstSentence, secondSentence);
        } catch (MyExeption myExeption) {
            logger.info("invalid option" + myExeption.getMessage());
        }
    }

    /**
     * method that evaluates repeated values in a sentence
     *
     * @param firstSentence  sentence
     * @param secondSentence sentence
     */
    public static void compare(String firstSentence, String secondSentence) {
        char[] one = firstSentence.toCharArray();
        char[] two = secondSentence.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        if (firstSentence.equalsIgnoreCase(secondSentence)) {
            logger.info("the phrases are the same");
        } else {
            int counter;
            for (int i = 0; i < firstSentence.length(); i++) {
                counter = 0;
                for (int j = 0; j < secondSentence.length(); j++) {
                    if (one[i] == two[j]) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    list.add(one[i]);

                }
            }
            logger.info("the main difference between the word " + firstSentence + " and  " + secondSentence + " is  \n"
                    + list);
        }

    }
}


