package com.countries.restapi.service;

import com.countries.restapi.persistence.Countries;
import com.countries.restapi.persistence.CountriesRespository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class CountriesService {

    CountriesRespository respository;

    public CountriesService(CountriesRespository respository) {
        this.respository = respository;
    }
    public Countries getCountryByName(String name) {
        return respository.findByName(name);
    }
    public List<Object[]> getAll() {
        return respository.findAllNamesAndCountryCodes();
    }

}
