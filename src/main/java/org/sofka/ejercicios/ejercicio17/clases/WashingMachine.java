package org.sofka.ejercicios.ejercicio17.clases;
/**
 * WashingMachine class that extends its attributes and methods from its parent class.
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class WashingMachine extends Appliances {
    /**
     * class attributes
     */
    private final int charge;

    /**
     * default constructor
     */
    public WashingMachine() {
        super();
        this.charge = 5;
    }

    /**
     *builder with the price and weight of a WashingMachine
     * @param basePrice WashingMachine
     * @param weight WashingMachine
     */
    public WashingMachine(double basePrice, int weight) {
        super(basePrice, weight);
        this.charge = 5;
    }

    /**
     *constructor with all its attributes
     * @param basePrice WashingMachine
     * @param color WashingMachine
     * @param powerConsumption WashingMachine
     * @param weight WashingMachine
     * @param charge WashingMachine
     */

    public WashingMachine(double basePrice, String color, char powerConsumption, int weight, int charge) {
        super(basePrice, color, powerConsumption, weight);
        this.charge = charge;
    }

    /**
     * this method returns the load level of a washing machine.
     * @return the load level of a washing machine
     */
    public int getCharge() {
        return charge;
    }

    /**
     *this method is extended from the parent class, household appliances, and new calculations are performed.
     *  @return the final price of a WashingMachine
     */
    @Override
    public double endPrice() {
        double price= super.endPrice();
        if (this.charge>30){
            price+=50;
        }
        return price;
    }
}
