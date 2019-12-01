package ua.treining.model;

/**
 * Created by Olena Orel on 26.11.2019.
 */
public class UserAddress {

    private String postalCode;
    private String cityName;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String fullAddressString;

    public UserAddress() {
    }

    public UserAddress(String index, String cityName, String street, String houseNumber, String apartmentNumber) {
        this.postalCode = index;
        this.cityName = cityName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public void createStringAddress() {
        StringBuffer fullAddress = new StringBuffer();
        String separator = ", ";
        fullAddress.append(postalCode).append(separator).append(cityName).append(separator)
                .append(street).append(separator).append(houseNumber).append(separator)
                .append(apartmentNumber);
        setFullAddressString(fullAddress.toString());
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setFullAddressString(String fullAddressString) {
        this.fullAddressString = fullAddressString;
    }

    public String getFullAddressString() {
        return fullAddressString;
    }
}
