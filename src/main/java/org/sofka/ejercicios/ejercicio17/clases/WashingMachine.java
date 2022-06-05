package org.sofka.ejercicios.ejercicio17.clases;

public class WashingMachine extends Appliances {
    private final int charge;

    public WashingMachine() {
        super();
        this.charge = 5;
    }

    public WashingMachine(double basePrice, int weight) {
        super(basePrice, weight);
        this.charge = 5;
    }

    public WashingMachine(double basePrice, String color, char powerConsumption, int weight, int charge) {
        super(basePrice, color, powerConsumption, weight);
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    @Override
    public double endPrice() {
        double price= super.endPrice();
        if (this.charge>30){
            price+=50;
        }
        return price;
    }
}
