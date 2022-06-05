package org.sofka.ejercicios.twelve;

import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;

import java.util.ArrayList;
import java.util.List;

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
        String result = null;
        List<Character> list1= new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        if (firstSentence.equalsIgnoreCase(secondSentence)){
            result="the phrases are the same";
            logger.info(result);
        }else{

        }

    }
}
