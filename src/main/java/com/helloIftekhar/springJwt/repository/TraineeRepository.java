package com.helloIftekhar.springJwt.repository;

import com.helloIftekhar.springJwt.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee,Integer> {
}
