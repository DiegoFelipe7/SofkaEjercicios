package org.sofka.ejercicios.ejercicio9;

import org.jboss.logging.Logger;

/**
 * class replace values of a phrase
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {
    static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        String declaration = "La sonrisa sera la mejor arma contra la tristeza";
        logger.info("Modified phrase");
        modifiedPhrase(declaration);
        logger.info("------------------");
    }

    /**
     * method to replace values in a phrase
     *
     * @param declaration phrase to which values will be replaced
     */
    public static void modifiedPhrase(String declaration) {
        String newSentence = declaration.replace("a", "e");
        logger.info(newSentence.concat(",sonrie siempre"));
    }
}
