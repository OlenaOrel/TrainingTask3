package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.UserAddress;
import ua.training.view.ViewMessages;

public class AddressController {

    private UtilityController contrUtil;
    private Model model;

    public AddressController(UtilityController contrUtil, Model model) {
        this.contrUtil = contrUtil;
        this.model = model;
    }

    UserAddress setInputUserAddress() {
        UserAddress address = model.getUserAddress();
        address.setPostalCode(getCorrectInputPostalCode());
        address.setCityName(getCorrectInputCityName());
        address.setStreet(getCorrectInputStreet());
        address.setHouseNumber(getCorrectInputHouseNumber());
        address.setApartmentNumber(getCorrectInputApartmentNumber());
        return address;
    }

    private String getCorrectInputPostalCode() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_POSTAL_CODE,
                RegexController.POSTAL_CODE);
    }

    private String getCorrectInputCityName() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_CITY_NAME,
                RegexController.CITY_NAME);
    }

    private String getCorrectInputStreet() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_STREET,
                RegexController.STREET_NAME);
    }

    private String getCorrectInputHouseNumber() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_HOUSE_NUMBER,
                RegexController.NUMBER_OF_HOUSE_OR_APARTMENT);
    }

    private String getCorrectInputApartmentNumber() {
        return contrUtil.inputStringValueWithScanner(ViewMessages.INPUT_APARTMENT_NUMBER,
                RegexController.NUMBER_OF_HOUSE_OR_APARTMENT);
    }

}
