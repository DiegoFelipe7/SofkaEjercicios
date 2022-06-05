package org.sofka.ejercicios.ten_sixteen.clases;
/**
 * person class with its required attributes and methods
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class People {
    /**
     * class attributes
     */
    private String name;
    private int age;
    private final int dni;
    private char sex;
    private int weight;
    private double height;

    /**
     *
     * @param name string people
     * @param age int people
     * @param sex char people
     * @param weight int people
     * @param height double people
     */
    public People(String name, int age, char sex, int weight, double height) {
        this.name = name;
        this.age = age;
        this.dni = generateID();
        this.sex = checkSex(sex);
        this.weight = weight;
        this.height = height;
    }

    /**
     * class construct with parameters
     * @param name string people
     * @param age int people
     * @param sex char people
     */
    public People(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.dni = generateID();
        this.sex = checkSex(sex);
        this.weight = 0;
        this.height = 0;
    }

    /**
     * default constructor
     */
    public People() {
        this.name = "";
        this.age = 0;
        this.dni = generateID();
        this.sex = 'H';
        this.weight = 0;
        this.height = 0;
    }

    /**
     *method of sending information
     * @param name people
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * method of sending information
     * @param age people
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * method of receiving information
     * @return dni people
     */
    public int getDni() {
        return dni;
    }

    /**
     * method of sending information
     * @param sex people
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * method of sending information
     * @param weight people
     */

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * method of sending information
     * @param height people
     */

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * method that performs IMC calculations
     * @return int
     */
    public int calculateIMC() {
        double equals = this.weight / Math.pow(this.height, this.height);
        int result = (int) equals;
        if (result < 20) {
            return -1;
        } else if (result > 20 && result <= 25) {
            return 0;
        } else if (result > 25) {
            return 1;
        }
        return 0;
    }

    /**
     * message that determines whether you are at your ideal weight or not.
     *
     * @return String
     */
    public String resultImc() {
        int result = calculateIMC();
        if (result < 0) {
            return "YOU ARE BELOW YOUR IDEAL WEIGHT";
        } else if (result == 1) {
            return "YOU ARE ABOVE YOUR TARGET WEIGHT";
        }
        return "YOU ARE AT YOUR IDEAL WEIGHT";
    }

    /**
     * method that evaluates whether sex
     *
     * @param sex variable to be evaluated
     * @return char with the type of sex
     */
    public char checkSex(char sex) {
        if (sex == 'F' || sex == 'f') {
            return 'F';
        }
        return 'H';
    }

    /**
     * method that evaluates if a person is of legal age
     *
     * @return boolean
     */
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    /**
     * method generating a random value of 8 digits
     *
     * @return double identification
     */
    public int generateID() {
        double id = 10000000 + Math.random() * 9000000;
        return (int) id;
    }


}
