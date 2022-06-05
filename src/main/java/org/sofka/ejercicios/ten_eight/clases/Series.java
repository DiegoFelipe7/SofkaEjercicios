package org.sofka.ejercicios.ten_eight.clases;

import org.sofka.ejercicios.ten_eight.interfaces.Deliverable;

/**
 * classes series with its attributes and methods which implements an interface
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Series implements Deliverable {
    /**
     * class attributes
     */
    private final String title;
    private final int numberSeasons;
    private boolean delivered;
    private final String genre;
    private final String creator;

    /**
     * default constructor
     */
    public Series() {
        this.title = "";
        this.numberSeasons = 3;
        this.delivered = false;
        this.genre = "";
        this.creator = "";
    }

    /**
     * constructor who receives the title ,genre ,creator of a series
     *
     * @param title   series
     * @param genre   series
     * @param creator series
     */

    public Series(String title, String genre, String creator) {
        this.title = title;
        this.numberSeasons = 3;
        this.delivered = false;
        this.genre = genre;
        this.creator = creator;

    }

    public Series(String title, int numberSeasons, String genre, String creator) {
        this.title = title;
        this.numberSeasons = numberSeasons;
        this.delivered = false;
        this.genre = genre;
        this.creator = creator;
    }


    public int getNumberSeasons() {
        return numberSeasons;
    }

    /**
     * @return message with the values of the constructor
     */
    @Override
    public String toString() {
        return "Series " +
                "title='" + title + '\'' +
                ", numberSeasons=" + numberSeasons +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'';
    }

    /**
     * interface method that changes delivery status
     *
     * @return delivered
     */
    @Override
    public boolean deliver() {
        return this.delivered = true;
    }

    /**
     * interface method that changes delivery status
     *
     * @return delivered
     */
    @Override
    public boolean returns() {
        return this.delivered = false;
    }

    /**
     * method returns delivery
     *
     * @return delivered
     */
    @Override
    public boolean isDelivered() {
        return this.delivered;
    }

    /**
     *method for determining the largest number of series
     * @param ob  series
     * @return  int
     */
    @Override
    public int compareTo(Object ob) {
        Series series = (Series) ob;
        if (this.getNumberSeasons() > series.getNumberSeasons()) {
            return -1;
        } else if (this.getNumberSeasons() == series.getNumberSeasons()) {
            return 0;
        } else {
            return 1;
        }
    }
}
