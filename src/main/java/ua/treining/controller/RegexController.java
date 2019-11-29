package ua.treining.controller;

public interface RegexController {

    //check users first name, second name amd middle name
    String NAME_REGEX = "[A-Z]{1}[a-z]{29}";

    //check login
    String LOGIN_REGEX = "[A-Za-z0-9_]{30}";

    //check phone number
    String PHONE_NUMBER = "(\\+38)(\\ |-|)(\\(|)\\d{3,4}(\\)|)(\\ |-|)\\d{2,3}(\\ |-)(\\d{2,3}(\\ |-)\\d{1,3}|\\d{4})";

    //check email address
    String EMAIL = "/^[0-9a-z-\\.]+\\@[0-9a-z-]{2,}\\.[a-z]{2,6}$/i";

    String DATE = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";

    String POSTAL_CODE = "[0-9]{5}";

    String CITY_NAME = "/^([A-Za-z]+[\\ |-]?[A-Za-z]*[\\ |-]?[A-Za-z]*[\\ |-]?[A-Za-z]*)$/i";

    String STREET_NAME = "";

    String NUMBER_OF_HOUSE_OR_APARTMENT = "[0-9][a-z]?";


}
