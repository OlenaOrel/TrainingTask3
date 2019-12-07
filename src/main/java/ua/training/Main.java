package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Model;
import ua.training.model.User;
import ua.training.model.UserAddress;
import ua.training.view.View;

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
