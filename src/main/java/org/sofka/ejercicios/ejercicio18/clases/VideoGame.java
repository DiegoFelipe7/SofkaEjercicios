package org.sofka.ejercicios.ejercicio18.clases;

import org.sofka.ejercicios.ejercicio18.Interfaces.Deliverable;

public class VideoGame implements Deliverable {
    private String title;
    private int estimatedHours;
    private boolean delivered;
    private String gender;
    private String company;

    public VideoGame(){
        this.title = "";
        this.estimatedHours = 0;
        this.delivered=false;
        this.gender = "";
        this.company = "";

    }

    public VideoGame(String title, int estimatedHours, String gender, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = gender;
        this.company = company;
    }

    public VideoGame(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
    }

    @Override
    public String toString() {
        return "VideoGame " +
                "title='" + title + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", delivered=" + delivered +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'';
    }

    @Override
    public boolean deliver() {
        return false;
    }

    @Override
    public boolean returns() {
        return false;
    }

    @Override
    public Object compareTo(Object ob) {
        return null;
    }
}
