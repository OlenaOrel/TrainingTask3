package ua.treining.controller;

import ua.treining.view.View;

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
                (res = scanner.next()).matches(regex))) {
            view.print(message);
        }
        return res;
    }
}

