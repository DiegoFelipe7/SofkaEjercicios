package org.sofka.ejercicios.ejercicio6;

import org.jboss.logging.Logger;

/**
 * class calculate odd and even numbers using the cycle for
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
     * cycle for even numbers
     */

    public static void evenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                logger.info(i);
            }
        }
    }

    /**
     * cycle for odd numbers
     */
    public static void oddNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                logger.info(i);
            }
        }
    }
}

