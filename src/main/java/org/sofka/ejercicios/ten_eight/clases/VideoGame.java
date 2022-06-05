package org.sofka.ejercicios.ten_eight.clases;

import org.sofka.ejercicios.ten_eight.interfaces.Deliverable;
/**
 * classes VideoGame with its attributes and methods which implements an interface
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class VideoGame implements Deliverable {
    /**
     * class attributes
     */
    private final String title;
    private final int estimatedHours;
    private boolean delivered;
    private final String gender;
    private final String company;

    /**
     * default constructor
     */
    public VideoGame(){
        this.title = "";
        this.estimatedHours = 10;
        this.delivered=false;
        this.gender = "";
        this.company = "";

    }

    /**
     *builder receiving the title, hours, genre, company of a video game
     * @param title VideoGame
     * @param estimatedHours VideoGame
     * @param gender VideoGame
     * @param company VideoGame
     */
    public VideoGame(String title, int estimatedHours, String gender, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = gender;
        this.company = company;
    }

    /**
     * builder receiving title , hours of a video game
     * @param title VideoGame
     * @param estimatedHours VideoGame
     */
    public VideoGame(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = "";
        this.company = "";
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    /**
     *
     * @return message with the values of the constructor
     */
    @Override
    public String toString() {
        return "VideoGame " +
                "title='" + title + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", delivered=" + delivered +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'';
    }

    /**
     * interface method that changes delivery status
     * @return delivered
     */
    @Override
    public boolean deliver() {
        return this.delivered=true;
    }

    /**
     * interface method that changes delivery status
     * @return delivered
     */

    @Override
    public boolean returns() {
        return this.delivered=false;
    }

    /**
     *  method returns delivery
     * @return delivered
     */
    @Override
    public boolean isDelivered() {
        return this.delivered;
    }

    /**
     *method to determine the game with the most hours
     * @param ob videogame
     * @return int
     */
    @Override
    public int compareTo(Object ob) {
        VideoGame videoGame = (VideoGame) ob;

        if(this.estimatedHours> videoGame.getEstimatedHours()){
            return -1;
        }else if(this.estimatedHours== videoGame.getEstimatedHours()){
            return 0;
        }else {
            return 1;
        }

    }
}
