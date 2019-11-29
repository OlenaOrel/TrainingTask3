package ua.treining.controller;

import ua.treining.model.Model;
import ua.treining.model.User;
import ua.treining.model.UserAddress;
import ua.treining.view.ViewMessages;

public class UserController {

    private UtilityController contrUtil;
    private AddressController addressController;
    private Model model;

    UserController(UtilityController contrUtil, AddressController addressController, Model model) {
        this.contrUtil = contrUtil;
        this.addressController = addressController;
        this.model = model;
    }

    User addUser() {
        User user = model.getUser();
        user.setFirstName(getCorrectInputFirstName());
        user.setLastName(getCorrectInputLastName());
        user.setMiddleName(getCorrectInputMiddleName());
        user.setLogin(getCorrectInputLogin());
//        user.setGroups();
        user.setHomePhoneNumber(getCorrectInputHomePhoneNumber());
        user.setPhoneNumber(getCorrectInputPhoneNumber());
        user.setEmailAddress(getCorrectInputEmailAddress());
        user.setSkypeName(getCorrectInputSkypeName());
        user.setAddress(getUserAddressString());
//        user.setRegistrationDate();
        return user;
    }

    private String getCorrectInputFirstName() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_FIRST_NAME,
                RegexController.NAME_REGEX);
    }

    private String getCorrectInputLastName() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_LAST_NAME,
                RegexController.NAME_REGEX);
    }

    private String getCorrectInputMiddleName() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_MIDDLE_NAME,
                RegexController.NAME_REGEX);
    }

    private String getCorrectInputLogin() {
        String res = contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_LOGIN,
                RegexController.LOGIN_REGEX);
        return res;
    }

    private String getCorrectInputHomePhoneNumber() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_HOUSE_NUMBER,
                RegexController.PHONE_NUMBER);
    }

    private String getCorrectInputPhoneNumber() {
        String res = contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_PHONE_NUMBER,
                RegexController.PHONE_NUMBER);
        return res;
    }

    private String getCorrectInputEmailAddress() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_EMAIL,
                RegexController.EMAIL);
    }

    private String getCorrectInputSkypeName() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_SKYPE,
                RegexController.LOGIN_REGEX);
    }

    private String getUserAddressString() {
        UserAddress address = addressController.setInputUserAddress();
        address.createStringAddress();
        return address.getFullAddressString();
    }
}
