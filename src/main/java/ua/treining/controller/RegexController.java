package ua.treining.controller;

public interface RegexController {

    //check users first name, second name amd middle name
    String NAME_REGEX = "^[A-Z][a-z]{1,20}$";

    //check login
    String LOGIN_REGEX = "^[A-Za-z0-9_-]{4,30}";

    //check phone number
    String HOME_PHONE_NUMBER = "((\\+38)(\\ |-|))*(\\(|)\\d{3,5}(\\)|)(\\ |-|)\\d{1,3}(\\ |-)(\\d{2,3}(\\ |-)\\d{1,3}|\\d{4})";

    String PHONE_NUMBER = "((\\+38)(\\ |-|))*(\\(|)\\d{3}(\\)|)(\\ |-|)\\d{3}(\\ |-)(\\d{2}(\\ |-)\\d{2}|\\d{4})";

    //check email address
    String EMAIL = "^(|(([A-Za-z0-9]+_+)|([A-Za-z0-9]+\\-+)|([A-Za-z0-9]+\\.+)|([A-Za-z0-9]+\\++))*[A-Za-z0-9]+@((\\w+\\-+)|(\\w+\\.))*\\w{1,63}\\.[a-zA-Z]{2,6})$";

    String DATE = "(0[1-9]|[12][0-9]|3[01])[\\-|\\/|\\.](0[1-9]|1[012])[\\-|\\/|\\.](19|20)\\d\\d";

    String POSTAL_CODE = "[0-9]{5}";

    String CITY_NAME = "^([A-Za-z]+[\\ |-]?[A-Za-z]*[\\ |-]?[A-Za-z]*[\\ |-]?[A-Za-z]*)$";

    String STREET_NAME = "^([A-Za-z0-9]+[\\ |-]?[A-Za-z]*[\\ |-]?[A-Za-z]*[\\ |-]?[A-Za-z]*)$";

    String NUMBER_OF_HOUSE_OR_APARTMENT = "^(([0-9]{1,4})[\\ |\\/|]*([a-z]{1}|[1-9]{1,3})*)$";

}
