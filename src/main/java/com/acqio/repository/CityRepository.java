package com.acqio.repository;

import com.acqio.models.City;
import com.acqio.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
