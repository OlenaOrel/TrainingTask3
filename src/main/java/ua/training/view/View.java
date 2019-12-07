package ua.training.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Olena Orel on 26.11.2019.
 */
public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
//                    new Locale("en"));        // English


    public void print(String message) {
        System.out.println(bundle.getString(message));
    }

    public void printWrongInputMessage(String message) {
        System.out.print(bundle.getString(ViewMessages.WRONG_INPUT));
        System.out.println(bundle.getString(message));
    }

}
