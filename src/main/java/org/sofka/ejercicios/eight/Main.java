package org.sofka.ejercicios.eight;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;
import org.jboss.logging.Logger;
/**
 * class to determine a working or non-working day
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();
    public static void main(String[] args) {
        try {
            logger.info("Enter a day of the week");
            String day = scanner.getString();
            workingDays(day);
        }catch (MyExeption myExeption){
            logger.info("invalid option"+myExeption.getMessage());
        }
    }

    /**
     * method for determining a working day
     *
     * @param day receives a day of the week
     */
    public static void workingDays(String day){
        switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                    logger.info("The day "+ day+" is a working day.");
            case "SATURDAY", "SUNDAY"->
                    logger.info("The day " + day + " is not a working day.");
            default -> logger.info("Verify the name of the day");
        }
    }
}
