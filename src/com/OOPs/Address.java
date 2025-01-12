package com.OOPs;

public class Address {
    private String streetLine;
    private String city;
    private String zipcode;

    public Address(String line1, String city, String zipcode) {
        this.streetLine = line1;
        this.city = city;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetLine='" + streetLine + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
