package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private final List<Country> countries = new ArrayList<>();

    public CountryService() {

        countries.add(new Country("IN","India"));
        countries.add(new Country("US","United States"));
        countries.add(new Country("DE","Germany"));
        countries.add(new Country("JP","Japan"));

    }

    public List<Country> getCountries(){

        return countries;

    }

    public Country getCountry(String code){

        return countries.stream()

                .filter(c -> c.getCode().equalsIgnoreCase(code))

                .findFirst()

                .orElse(null);

    }

}