package com.acqio.repository;

import com.acqio.models.Person;
import com.acqio.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
