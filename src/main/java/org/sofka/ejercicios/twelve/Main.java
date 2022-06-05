package org.sofka.ejercicios.twelve;

import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;

/**
 * class to determine the differences between two words
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();
    public static void main(String[] args) {
        try {
            logger.info("enter your first sentence");
            String firstSentence= scanner.getString();
            logger.info("enter your second sentence");
            String secondSentence= scanner.getString();
            compare(firstSentence,secondSentence);
        }catch (MyExeption myExeption){
            logger.info("invalid option"+myExeption.getMessage());
        }
    }
    public static  void compare(String firstSentence , String secondSentence){


        }
    }
