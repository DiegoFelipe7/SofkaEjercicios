package org.sofka.ejercicios.fifteen;

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
    static final org.jboss.logging.Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        String message = "--- FILM MANAGEMENT --- \n 1-NEW ACTOR \n 2-SEARCH FOR ACTOR " +
                "\n 3-REMOVE ACTOR \n 4-MODIFY ACTOR \n 5-VIEW ALL ACTORS \n 6- VIEW ACTOR'S MOVIES" +
                "\n 7-VIEW ACTOR'S MOVIE CATEGORIES \n 8-EXIT";
        String option = "";
        do {
            try {
                logger.info(message);
                logger.info("Select the option");
                int value = scanner.getInteger();
                option = cases(value);
                logger.info(option);
            } catch (MyExeption myExeption) {
                logger.info("invalid option" + myExeption.getMessage());
            }
        } while (!option.equals("EXIT"));
    }

    /**
     * prints messages related to a case
     *
     * @param value value to determine any of the cases
     */
    public static String cases(int value) {
        return switch (value) {
            case 1 -> "NEW ACTOR";
            case 2 -> "SEARCH FOR ACTOR";
            case 3 -> "REMOVE ACTOR";
            case 4 -> "MODIFY ACTOR";
            case 5 -> "VIEW ALL ACTORS";
            case 6 -> "VIEW ACTOR'S MOVIES";
            case 7 -> "VIEW ACTOR'S MOVIE CATEGORIES";
            case 8 -> "EXIT";
            default -> "ERROR";
        };
    }
}

