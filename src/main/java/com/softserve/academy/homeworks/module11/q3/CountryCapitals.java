package com.softserve.academy.homeworks.module11.q3;

import java.util.HashMap;
import java.util.Map;

public class CountryCapitals {
    private Map<String, String> countryCapitals;

    public CountryCapitals() {
        countryCapitals = new HashMap<>();
    }


    public void addCountry(String country, String capital) {
        if (!countryCapitals.containsKey(country)){
            countryCapitals.put(country, capital);
        }
    }


    public String getCapital(String country) {
        if (countryCapitals.containsKey(country)){
            return countryCapitals.get(country);
        }
        return null;
    }


    public void removeCountry(String country) {
        countryCapitals.remove(country);
    }


    public int getCountryCount() {
        return countryCapitals.size();
    }
}
