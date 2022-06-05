package org.sofka.ejercicios.ten_eight.main;
import org.sofka.ejercicios.ten_eight.clases.Series;
import org.sofka.ejercicios.ten_eight.clases.VideoGame;
import org.jboss.logging.Logger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        ArrayList<Series> series = new ArrayList<>();
        ArrayList<VideoGame> videoGame = new ArrayList<>();
        series.add(new Series("ALICIA IN WONDERLAND",5,"ACTION","DIEGO"));
        series.add(new Series("GAME OF THRONES",6,"ADRENALIN","FELIPE"));
        series.add(new Series("ONCE UPON A TIME",5,"LOVE","CARLOS"));
        series.add(new Series("JURASSIC WORD",5,"COMEDY","DAVID"));
        series.add(new Series("CAMELOT",3,"FEAR","SANTIAGO"));
        videoGame.add(new VideoGame("HALO",20,"SHOOTING","WINDOWS"));
        videoGame.add(new VideoGame("CALL DUTY",18,"MESA","LINUX"));
        videoGame.add(new VideoGame("FREE FIRE",40,"AIRPLANES","MAC"));
        videoGame.add(new VideoGame("LOL",15,"FIGHTS","ASUS"));
        videoGame.add(new VideoGame("FIFA",30,"SPORT","GAME"));

        deliveries(series,videoGame);

    }
    public static void deliveries (List<Series> series , List<VideoGame> videoGame){
        series.get(0).deliver();
        series.get(2).deliver();
        videoGame.get(4).deliver();
        videoGame.get(1).deliver();
        int isDeliveredSeries = 0;
        int isDeliveredVideoGame=0;

        for (Series SeriesA : series) {
            if(SeriesA.isDelivered()){
                isDeliveredSeries++;
            }
        }

        for (VideoGame VideoGameA : videoGame) {
            if (VideoGameA.isDelivered()) {
                isDeliveredVideoGame++;
            }
        }
        logger.info("-----------deliveries-----------");
        logger.info("number of series delivered " +isDeliveredSeries+"\n" +
                "number of video games delivered "+isDeliveredVideoGame);
    }
}