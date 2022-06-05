package org.sofka.utils;

import org.sofka.utils.abstracts.MyScannerAbstract;

public class MyScanner extends MyScannerAbstract {

    public static MyScanner getInstance() {
        return new MyScanner();
    }

    @Override
    public Integer getInteger() {
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new MyExeption(exception.getMessage(), exception);
        }
    }

    @Override
    public Double getDouble() {
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new MyExeption(exception.getMessage(), exception);
        }
    }

    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new MyExeption(exception.getMessage(), exception);
        }
    }

}
