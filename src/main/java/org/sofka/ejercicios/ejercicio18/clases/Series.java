package org.sofka.ejercicios.ejercicio18.clases;

import org.sofka.ejercicios.ejercicio18.Interfaces.Deliverable;

public class Series implements Deliverable {
    private String title;
    private int numberSeasons;
    private boolean delivered;
    private String genre;
    private String creator;

    public Series() {
        this.title = "";
        this.numberSeasons = 3;
        this.delivered = false;
        this.genre = "";
        this.creator = "";
    }

    public Series(String title, String genre,String creator) {
        this.title = title;
        this.numberSeasons = 3;
        this.delivered = false;
        this.genre = genre;
        this.creator = creator;

    }

    public Series(String title,int numberSeasons,String genre , String creator){
        this.title = title;
        this.numberSeasons = numberSeasons;
        this.delivered = false;
        this.genre = genre;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberSeasons() {
        return numberSeasons;
    }

    public void setNumberSeasons(int numberSeasons) {
        this.numberSeasons = numberSeasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Series " +
                "title='" + title + '\'' +
                ", numberSeasons=" + numberSeasons +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'';
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
