package ua.treining;

import ua.treining.controller.Controller;
import ua.treining.model.Model;
import ua.treining.model.User;
import ua.treining.model.UserAddress;
import ua.treining.view.View;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        UserAddress userAddress = new UserAddress();

        Model model = new Model(user, userAddress);
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.process();
    }
}
