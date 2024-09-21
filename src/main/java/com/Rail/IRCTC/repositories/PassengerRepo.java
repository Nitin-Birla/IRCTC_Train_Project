package com.Rail.IRCTC.repositories;

import com.Rail.IRCTC.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger,Integer> {
}
