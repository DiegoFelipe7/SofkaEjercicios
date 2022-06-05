package org.sofka.ejercicios.ejercicio3;

import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;
import org.jboss.logging.Logger;

/**
 * class  calculate the area of a circle
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        try {
            logger.info("Enter the radius");
            String radio = scanner.getString();
            calculateArea(radio);
        } catch (MyExeption myExeption) {
            logger.info("invalid option" + myExeption.getMessage());
        }
    }

    /**
     * @param radio receives the radius of a circle
     */
    public static void calculateArea(String radio) {
        double r = Double.parseDouble(radio);
        double result = (Math.PI * Math.pow(r, 2));
        logger.info("The result is " + result);

    }
}
