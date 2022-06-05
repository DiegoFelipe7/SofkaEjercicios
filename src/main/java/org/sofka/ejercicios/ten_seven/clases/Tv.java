package org.sofka.ejercicios.ten_seven.clases;
/**
 * tv class that extends its attributes and methods from its parent class.
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Tv extends Appliances{
    /**
     * class attributes
     */
    private final int inches;
    private final boolean tdt;

    /**
     * default constructor
     */
    public Tv(){
        super();
        this.inches=20;
        this.tdt=false;
    }

    /**
     *builder with the price and weight of a tv
     * @param basePrice tv
     * @param weight tv
     */
    public Tv(double basePrice , int weight){
        super(basePrice,weight);
        this.inches=20;
        this.tdt=false;
    }

    /**
     * constructor with all its attributes
     * @param basePrice tv
     * @param color tv
     * @param powerConsumption tv
     * @param weight tv
     * @param inches tv
     * @param tdt tv
     */
    public Tv(double basePrice, String color, char powerConsumption, int weight, int inches, boolean tdt) {
        super(basePrice, color, powerConsumption, weight);
        this.inches = inches;
        this.tdt = tdt;
    }

    /**
     * method that returns the inches of a tv
     * @return the inches of a tv
     */
    public int getInches() {
        return inches;
    }

    /**
     *
     * @return true o false
     */
    public boolean isTdt() {
        return tdt;
    }

    /**
     *this method is extended from the parent class, household appliances, and new calculations are performed.
     * @return the final price of a tv
     */

    @Override
    public double endPrice() {
        double price= super.endPrice();
        double increase;
        if (this.getInches()>40){
            increase = (price * 30) / 100;
            price+=increase;
        }else if(isTdt()){
            price+=50;
        }
        return price;
    }
}
