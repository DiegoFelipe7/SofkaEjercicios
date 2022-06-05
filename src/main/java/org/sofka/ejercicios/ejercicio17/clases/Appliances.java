package org.sofka.ejercicios.ejercicio17.clases;

/**
 * super class household appliances with its attributes and methods this super class is the template for its child classes
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Appliances {
    /**
     * class attributes
     */
    private double basePrice;
    private final String[] colors = {"WHITE", " BLACK", "RED", " BLUE", "GRAY"};
    private String color;

    private final char[] powerConsumptions = {'A', 'B', 'C', 'D', 'E', 'F'};
    private char powerConsumption;
    private int weight;

    /**
     * default constructor with values assigned to its attributes
     */
    public Appliances() {
        this.basePrice = 100;
        this.color = colors[0];
        this.powerConsumption = 'F';
        this.weight = 5;
    }

    /**
     * constructor with the attributes of the class
     *
     * @param basePrice        Appliances
     * @param color            Appliances
     * @param powerConsumption Appliances
     * @param weight           Appliances
     */

    public Appliances(double basePrice, String color, char powerConsumption, int weight) {
        this.basePrice = basePrice;
        this.color = checkColor(color);
        this.powerConsumption = checkEnergyConsumption(powerConsumption);
        this.weight = weight;
    }

    /**
     * constructor with the two attributes of the class
     *
     * @param basePrice Appliances
     * @param weight    Appliances
     */
    public Appliances(double basePrice, int weight) {
        this.basePrice = basePrice;
        this.color = colors[0];
        this.powerConsumption = 'F';
        this.weight = weight;
    }

    /**
     * method that returns the price
     *
     * @return basePrice appliances
     */

    public double getBasePrice() {
        return basePrice;
    }

    /**
     * price shipment method
     *
     * @param basePrice appliances
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * method that returns the color
     *
     * @return color appliances
     */

    public String getColor() {
        return color;
    }

    /**
     * color shipment method
     *
     * @param color appliances
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * method that returns the service level
     *
     * @return powerConsumption appliances
     */
    public char getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * powerConsumption shipment method
     *
     * @param powerConsumption appliances
     */

    public void setPowerConsumption(char powerConsumption) {
        this.powerConsumption = powerConsumption;
    }


    /**
     * method that returns the weight
     *
     * @return weight appliances
     */

    public int getWeight() {
        return weight;
    }

    /**
     * method of weight shipment
     *
     * @param weight appliances
     */

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * this method evaluates a category of services
     *
     * @param letter character to be evaluated
     * @return the f value in case of non-existence of the validated category
     */

    public char checkEnergyConsumption(char letter) {
        for (char s : powerConsumptions) {
            if (s == letter) {
                return s;
            }
        }
        return 'F';
    }

    /**
     * this method evaluates a type of colors
     *
     * @param color color to be evaluated
     * @return white if the entered color does not exist
     */
    public String checkColor(String color) {
        for (String s : colors) {
            if (s.equalsIgnoreCase(color)) {
                return s;
            }
        }
        return "WHITE";
    }

    /**
     * this method realizes an increase in the base price
     *
     * @return the price with a markup due to its category
     */
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

    /**
     *method realizes an increase in the final price
     * @return of the final price of an appliance
     */

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
