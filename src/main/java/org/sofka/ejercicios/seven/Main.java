package org.sofka.ejercicios.seven;
import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;
/**
 *class print a number greater than zero
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();
    public static void main(String[] args) {
        int number=0;
        do {
            try {
                logger.info("Enter a number");
                number= scanner.getInteger();
            }catch (MyExeption myExeption){
                logger.info("invalid option"+myExeption.getMessage());
            }
        }while(number<0);
            logger.info("The number entered by the user is "+number);
    }
}
