package org.sofka.ejercicios.ejercicio14;

import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;

/**
 * class that prints values from an initial number up to 1000
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        try {
            logger.info("enter a value");
            int value = scanner.getInteger();
            for (int i = value; i <= 1000; i += 2) {
                logger.info(i);
            }
        } catch (MyExeption myExeption) {
            logger.info("invalid option" + myExeption.getMessage());
        }
    }
}
