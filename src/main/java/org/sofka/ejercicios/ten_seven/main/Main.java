package org.sofka.ejercicios.ten_seven.main;

import org.sofka.ejercicios.ten_seven.clases.Appliances;
import org.sofka.ejercicios.ten_seven.clases.Tv;
import org.sofka.ejercicios.ten_seven.clases.WashingMachine;
import java.util.ArrayList;
import java.util.List;
import org.jboss.logging.Logger;
/**
 * class to perform the registration of different appliances and calculate their final price
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */

public class Main {
    public static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {

        ArrayList<Appliances> appliances = new ArrayList<>();
        appliances.add(new Tv(100, "WHiTE", 'G', 20, 30, true));
        appliances.add(new Tv(22, "BLaCK", 'B', 19, 50, true));
        appliances.add(new Tv(23, "REd", 'C', 28, 35, true));
        appliances.add(new Tv(24, "BLUE", 'Z', 9, 16, false));
        appliances.add(new Tv(18, "GRA", 'W', 5, 20, true));
        appliances.add(new WashingMachine(46, "WHiTE", 'G', 81, 49));
        appliances.add(new WashingMachine(46, "BLaCK", 'A', 50, 69));
        appliances.add(new WashingMachine(46, "REd", 'B', 32, 50));
        appliances.add(new WashingMachine(46, "white", 'F', 13, 89));
        appliances.add(new WashingMachine(46, "GRA", 'P', 60, 10));
        priceAppliances(appliances);
    }

    /**
     *this method evaluates the price of different household appliances
     * @param appliances receives a list of household appliance type objects
     */
    public static void priceAppliances(List<Appliances> appliances) {
        double appliancesSum = 0;
        double tvSum = 0;
        double washingMachineSum = 0;
        for (Appliances appliance : appliances) {
            appliancesSum+=appliance.endPrice();
            if (appliance instanceof Tv) {
                tvSum += appliance.endPrice();
            }
            if (appliance instanceof WashingMachine) {
                washingMachineSum += appliance.endPrice();
            }
            logger.info("price of household appliances : " + appliance.endPrice());
            logger.info("----------------Sum----------------");
            logger.info("total number of household appliances : " + appliancesSum);
            logger.info("total number of televisions : " + tvSum);
            logger.info("total number of washing machines : " + washingMachineSum);

        }
    }
}
