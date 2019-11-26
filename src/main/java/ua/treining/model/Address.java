package ua.treining.model;

/**
 * Created by Olena Orel on 26.11.2019.
 */
public class Address {

    private String postalCode;
    private String cityName;
    private String street;
    private int houseNumber;
    private int apartmentNumber;

    public Address() {
    }

    public Address(String index, String cityName, String street, int houseNumber, int apartmentNumber) {
        this.postalCode = index;
        this.cityName = cityName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getIndex() {
        return postalCode;
    }

    public void setIndex(String index) {
        this.postalCode = index;
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

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
