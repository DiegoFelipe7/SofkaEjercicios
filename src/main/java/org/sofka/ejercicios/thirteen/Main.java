package org.sofka.ejercicios.thirteen;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.jboss.logging.Logger;

public class Main {
    /**
     * class take the current date
     *
     * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
     * @version 1.0.0 29-05-2022
     */
    static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formats = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String datetime = formats.format(date);
        logger.info(datetime);
    }
}
