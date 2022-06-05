package org.sofka.ejercicios.ejercicio16.main;
import org.sofka.ejercicios.ejercicio16.clases.People;
import org.jboss.logging.Logger;
import org.sofka.utils.MyExeption;
import org.sofka.utils.MyScanner;
/**
 * class to perform user registration
 *
 * @author Diego Felipe Munoz Mosquera  - diegofelipem99@gmail.com
 * @version 1.0.0 29-05-2022
 */
public class Main {

    public static final Logger logger = Logger.getLogger("logger");
    static MyScanner scanner = MyScanner.getInstance();
    public static void main(String[] args) {
        int option=1;
        while(option<=3){
            userRegistration(option);
            option++;
        }
    }

    /**
     *method that allows for the registration of the three people
     * @param option option that allows the registration of all three persons
     */

    public static void userRegistration(int option) {

        if (option == 1) {
            try {
                logger.info("enter your name");
                String name = scanner.getString();
                logger.info("enter your age");
                int age = scanner.getInteger();
                logger.info("enter your sex");
                char sex = scanner.getString().charAt(0);
                logger.info("enter your weight");
                int weight = scanner.getInteger();
                logger.info("enter your height");
                double height = scanner.getDouble();
                People people = new People(name, age, sex, weight, height);
                personalInformation(people);
            } catch (MyExeption myExeption) {
                logger.info("invalid option" + myExeption.getMessage());
            }
        } else if (option == 2) {
            try {
                logger.info("enter your name");
                String name = scanner.getString();
                logger.info("enter your age");
                int age = scanner.getInteger();
                logger.info("enter your sex");
                char sex = scanner.getString().charAt(0);
                People people = new People(name, age, sex);
                personalInformation(people);
            }catch (MyExeption myExeption) {
                logger.info("invalid option" + myExeption.getMessage());
            }
        }else if(option==3){
            People people = new People();
            people.setName("Diego");
            people.setAge(22);
            people.setSex('M');
            people.setWeight(65);
            people.setHeight(1.75);
            personalInformation(people);
        }
    }

    /**
     * method that prints all the information of 3 different persons
     * @param people object of for the 3 persons
     */
    public static  void personalInformation(People people ){
        boolean age = people.isOfLegalAge();
        String height =people.resultImc();
        String result ="----------"+people.getDni()+"--------------- \n" +
                ""+height+"\n"+
                "" + people +"\n"+
                "is of legal age :"+age+"\n"+
                "-----------------------------------";
        logger.info(result);
    }
}
