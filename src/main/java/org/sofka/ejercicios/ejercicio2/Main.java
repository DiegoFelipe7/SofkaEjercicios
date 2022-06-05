package org.sofka.ejercicios.ejercicio2;

import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;
import org.jboss.logging.Logger;

/**
 * class  determine the largest number
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        try {
            logger.info("Enter the first number");
            int numberOne = scanner.getInteger();
            logger.info("Enter the second number");
            int numberTwo = scanner.getInteger();
            biggerNumber(numberOne, numberTwo);
        } catch (MyExeption myExeption) {
            logger.info("invalid option" + myExeption.getMessage());
        }
    }

    /**
     * @param numberOne receives the first number to compare
     * @param numberTwo receives the second number to compare
     */
    public static void biggerNumber(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            logger.info("The largest number is " + numberOne);
        } else if (numberTwo > numberOne) {
            logger.info("The largest number is " + numberTwo);
        } else {
            logger.info("The numbers are the same");
        }

    }
}
