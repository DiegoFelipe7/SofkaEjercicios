package org.sofka.ejercicios.ten_eight.main;

import org.sofka.ejercicios.ten_eight.clases.Series;
import org.sofka.ejercicios.ten_eight.clases.VideoGame;
import org.jboss.logging.Logger;
import java.util.ArrayList;
import java.util.List;
/**
 * class to determine the largest number of seasons and number of hours of a video game
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        ArrayList<Series> series = new ArrayList<>();
        ArrayList<VideoGame> videoGame = new ArrayList<>();
        series.add(new Series("ALICIA IN WONDERLAND", "ACTION", "DIEGO"));
        series.add(new Series("GAME OF THRONES", 4, "ADRENALIN", "FELIPE"));
        series.add(new Series("ONCE UPON A TIME", 1, "LOVE", "CARLOS"));
        series.add(new Series("JURASSIC WORD", 5, "COMEDY", "DAVID"));
        series.add(new Series());
        videoGame.add(new VideoGame("HALO", 20, "SHOOTING", "WINDOWS"));
        videoGame.add(new VideoGame("CALL DUTY", 18));
        videoGame.add(new VideoGame("FREE FIRE", 25, "AIRPLANES", "MAC"));
        videoGame.add(new VideoGame());
        videoGame.add(new VideoGame("FIFA", 30, "SPORT", "GAME"));

        deliveries(series, videoGame);
    }

    /**
     *
     * @param series list of series
     * @param videoGame list of videoGames
     */
    public static void deliveries(List<Series> series, List<VideoGame> videoGame) {
        series.get(0).deliver();
        series.get(2).deliver();
        videoGame.get(4).deliver();
        videoGame.get(1).deliver();
        int isDeliveredSeries = 0;
        int isDeliveredVideoGame = 0;
        VideoGame longestVideoGame = new VideoGame();
        Series largerSeries = new Series();

        for (Series SeriesA : series) {
            if (SeriesA.isDelivered()) {
                isDeliveredSeries++;
            }
            if (SeriesA.compareTo(series.get(0)) < 0) {
                largerSeries = SeriesA;
            }
        }

        for (VideoGame VideoGameA : videoGame) {
            if (VideoGameA.isDelivered()) {
                isDeliveredVideoGame++;
            }
            if (VideoGameA.compareTo(videoGame.get(0)) < 0) {
                longestVideoGame = VideoGameA;
            }

        }
        logger.info("-----------deliveries-----------");
        logger.info("number of series delivered " + isDeliveredSeries + "\n" +
                "number of video games delivered " + isDeliveredVideoGame+"\n"+
                "LONGER SERIES "+largerSeries +"\n"+
                "video game with more hours"+longestVideoGame);
    }

}