package ua.training.controller;

import ua.training.view.View;

import java.util.Scanner;

public class UtilityController {

    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.print(message);
        while (!(scanner.hasNext() &&
                (res = scanner.nextLine()).matches(regex))) {
            view.printWrongInputMessage(message);
        }
        return res;
    }
}

