package com.github.yanalexandre.citiesapi.states.repository;

import com.github.yanalexandre.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
