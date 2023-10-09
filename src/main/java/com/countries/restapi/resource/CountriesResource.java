package com.countries.restapi.resource;

import com.countries.restapi.persistence.Countries;
import com.countries.restapi.service.CountriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CountriesResource {

    CountriesService service;

    public CountriesResource(CountriesService service) {
        this.service = service;
    }

    @GetMapping(value = "/countries" )
    public List<Object[]> getAll() {
        return service.getAll();
    }
    @GetMapping("/countries/{name}")
    public Countries getCountryByName(@PathVariable String name) {
        return service.getCountryByName(name);
    }
}
