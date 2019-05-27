package com.example.customspinnerview;

public class Country  {
    private String countryName;
    private int imageId;

    public Country(String countryName, int imageId) {
        this.countryName = countryName;
        this.imageId = imageId;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getImageId() {
        return imageId;
    }
}
