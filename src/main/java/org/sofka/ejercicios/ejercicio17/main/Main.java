package org.sofka.ejercicios.ejercicio17.main;

import org.sofka.ejercicios.ejercicio17.clases.Appliances;
import org.sofka.ejercicios.ejercicio17.clases.Tv;
import org.sofka.ejercicios.ejercicio17.clases.WashingMachine;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;

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

    public static void priceAppliances(List<Appliances> appliances) {
        double AppliancesSum = 0;
        double TvSum = 0;
        double WashingMachineSum = 0;
        for (Appliances appliance : appliances) {
            if (appliance instanceof Appliances) {
                AppliancesSum += appliance.endPrice();
            }
            if (appliance instanceof Tv) {
                TvSum += appliance.endPrice();
            }
            if (appliance instanceof WashingMachine) {
                WashingMachineSum += appliance.endPrice();
            }
            logger.info("price of household appliances : " + appliance.endPrice());
            logger.info("----------------Sum----------------");
            logger.info("total number of household appliances : " + AppliancesSum);
            logger.info("total number of televisions : " + TvSum);
            logger.info("total number of washing machines : " + WashingMachineSum);

        }
    }
}
