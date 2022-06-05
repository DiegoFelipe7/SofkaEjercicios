package org.sofka.utils;

public class MyExeption extends RuntimeException {

    public MyExeption(String message) {
        super(message);
    }

    public MyExeption(String message, Exception exception) {
        super(message, exception);
    }

}

