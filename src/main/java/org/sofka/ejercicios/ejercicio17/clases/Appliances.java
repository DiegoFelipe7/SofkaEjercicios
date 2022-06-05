package org.sofka.ejercicios.ejercicio17.clases;

public class Appliances {
    private double basePrice;
    private final String[] colors = {"WHITE", " BLACK", "RED", " BLUE", "GRAY"};
    private String color;

    private final char[] powerConsumptions = {'A', 'B', 'C', 'D', 'E', 'F'};
    private char powerConsumption;
    private int weight;

    public Appliances() {
        this.basePrice = 100;
        this.color = colors[0];
        this.powerConsumption = 'F';
        this.weight = 5;
    }

    public Appliances(double basePrice, String color, char powerConsumption, int weight) {
        this.basePrice = basePrice;
        this.color = checkColor(color);
        this.powerConsumption = checkEnergyConsumption(powerConsumption);
        this.weight = weight;
    }

    public Appliances(double basePrice, int weight) {
        this.basePrice = basePrice;
        this.color = colors[0];
        this.powerConsumption = 'F';
        this.weight = weight;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(char powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char checkEnergyConsumption(char letter) {
        for (char s : powerConsumptions) {
            if (s == letter) {
                return s;
            }
        }
        return 'F';
    }

    public String checkColor(String color) {
        for (String s : colors) {
            if (s.equalsIgnoreCase(color)) {
                return s;
            }
        }
        return "WHITE";
    }

    public double priceCategory() {
        double price = this.getBasePrice();
        switch (this.powerConsumption) {
            case 'A' -> price += 100;
            case 'B' -> price += 80;
            case 'C' -> price += 60;
            case 'D' -> price += 50;
            case 'E' -> price += 30;
            case 'F' -> price += 10;
            default -> price = 0;
        }
        return price;
    }

    public double endPrice() {
        double price = priceCategory();
        if (this.weight >= 0 && this.weight <= 19) {
            price += 10;
        } else if (this.weight >= 20 && this.weight <= 49) {
            price += 50;
        } else if (this.weight >= 50 && this.weight <= 79) {
            price += 80;
        } else {
            price += 100;
        }
        return price;
    }
}
