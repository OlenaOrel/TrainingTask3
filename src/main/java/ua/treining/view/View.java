package ua.treining.view;

/**
 * Created by Olena Orel on 26.11.2019.
 */
public class View {

    public void print(String message) {
        System.out.println(message);
    }

    public void printWrongInputMessage(String message) {
        System.out.print(ViewMessages.WRONG_INPUT);
        System.out.println(message);
    }

}
