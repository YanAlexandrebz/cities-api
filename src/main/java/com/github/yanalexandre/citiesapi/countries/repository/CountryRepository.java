package com.github.yanalexandre.citiesapi.countries.repository;

import com.github.yanalexandre.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
