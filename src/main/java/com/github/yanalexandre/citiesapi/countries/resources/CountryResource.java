package com.github.yanalexandre.citiesapi.countries.resources;

import com.github.yanalexandre.citiesapi.countries.entity.Country;
import com.github.yanalexandre.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired //injeta o repository (injecao de dependencia)
    private CountryRepository repository;

    //FIND BY ID
    @GetMapping
    public Page<Country> countries(Pageable page){

        return repository.findAll(page);
    }

    //FIND BY ID
    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        } else{
            return ResponseEntity.notFound().build();
        }

    }
}
