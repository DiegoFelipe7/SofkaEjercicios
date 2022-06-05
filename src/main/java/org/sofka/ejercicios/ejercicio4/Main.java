package org.sofka.ejercicios.ejercicio4;

import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;

/**
 * class  calculate the price of a product plus vat
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();

    public static void main(String[] args) {
        try {
            logger.info("Enter the price of the product");
            double price = scanner.getDouble();
            productPrice(price);
        } catch (MyExeption myExeption) {
            logger.info("invalid option" + myExeption.getMessage());
        }
    }

    /**
     * @param price price of the product
     */
    public static void productPrice(double price) {
        int iva = 21;
        double results = ((price * iva) / 100 + price);
        logger.info("The price of this product, including taxes, is " + results);
    }
}
