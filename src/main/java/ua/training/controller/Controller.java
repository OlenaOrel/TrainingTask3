package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.Scanner;

/**
 * Created by Olena Orel on 26.11.2019.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void process() {
        Scanner scanner = new Scanner(System.in);
        UtilityController utilityController = new UtilityController(scanner, view);
        UserController userController = new UserController(utilityController, model);
        userController.createNewUser();
    }


}
