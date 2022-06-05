package org.sofka.ejercicios.ejercicio1;

import org.jboss.logging.Logger;

/**
 * class  determine the largest number
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        biggerNumber(1, 3);
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
