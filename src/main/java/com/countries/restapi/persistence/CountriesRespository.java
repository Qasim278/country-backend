package com.countries.restapi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountriesRespository extends JpaRepository<Countries,Long> {
    @Query("SELECT c.name, c.country_code FROM Countries c")
    List<Object[]> findAllNamesAndCountryCodes();
    @Query("SELECT c FROM Countries c WHERE c.name = :name")
    Countries findByName(String name);
}
