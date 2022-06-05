package org.sofka.ejercicios.ejercicio5;

import org.jboss.logging.Logger;

/**
 * class  calculate the odd and even numbers using the cycle while
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        logger.info("Even number counter");
        evenNumbers();
        logger.info("-----------------------");
        logger.info("Odd number counter");
        oddNumbers();
        logger.info("-----------------------");
    }

    /**
     * cycle while for even numbers
     */
    public static void evenNumbers() {
        int counter = 1;
        while (counter <= 100) {
            if (counter % 2 == 0) {
                logger.info(counter);
            }
            counter++;
        }
    }

    /**
     * cycle while for odd numbers
     */
    public static void oddNumbers() {
        int counter = 1;
        while (counter <= 100) {
            if (counter % 2 != 0) {
                logger.info(counter);
            }
            counter++;
        }
    }
}
