package com.Rail.IRCTC.repositories;

import com.Rail.IRCTC.entities.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepo extends JpaRepository<Train,Integer> {

}
