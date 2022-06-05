package org.sofka.ejercicios.ejercicio17.clases;

public class Tv extends Appliances{
    private final int inches;
    private final boolean tdt;

    public Tv(){
        super();
        this.inches=20;
        this.tdt=false;
    }

    public Tv(double basePrice , int weight){
        super(basePrice,weight);
        this.inches=20;
        this.tdt=false;
    }

    public Tv(double basePrice, String color, char powerConsumption, int weight, int inches, boolean tdt) {
        super(basePrice, color, powerConsumption, weight);
        this.inches = inches;
        this.tdt = tdt;
    }

    public int getInches() {
        return inches;
    }

    public boolean isTdt() {
        return tdt;
    }

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
