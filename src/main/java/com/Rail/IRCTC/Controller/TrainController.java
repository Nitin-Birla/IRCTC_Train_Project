package com.Rail.IRCTC.Controller;

import com.Rail.IRCTC.entities.FoodOrder;
import com.Rail.IRCTC.entities.Passenger;
import com.Rail.IRCTC.entities.Train;
import com.Rail.IRCTC.repositories.FoodOrderRepo;
import com.Rail.IRCTC.repositories.PassengerRepo;
import com.Rail.IRCTC.repositories.TrainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TrainController {

    @Autowired
    private TrainRepo trainRepo;

    @Autowired
    private PassengerRepo passengerRepo;

    @Autowired
    private FoodOrderRepo foodOrderRepo;





    @PostMapping("/addTrain")
    private Train createTrain(@RequestBody  Train train){
        Train t = trainRepo.save(train);
        return t;
    }

    @PostMapping("/addPassenger")
    private Passenger createPassenger(@RequestBody Passenger passenger){
        Passenger p = passengerRepo.save(passenger);
        return p;
    }

    @PostMapping("/addFoodOrder")
     private FoodOrder createFoodOrder(@RequestBody FoodOrder foodOrder) {
        FoodOrder f = foodOrderRepo.save(foodOrder);
        return f;
    }



    @PutMapping("/")
    private Train updateTrain(@RequestBody Train train, @RequestParam Integer trainId){
        Train tId = trainRepo.findById(trainId).orElse(null);
        tId.setTrainId(trainId);
        trainRepo.save(tId);
        return tId;
    }
    @GetMapping("/")
    private Train getTrainById(@RequestParam Integer trainId){
        Train gId = trainRepo.findById(trainId).orElse(null);
        return gId;
    }

    @GetMapping("/getAll")
    private List<Train> getAll(){
        List<Train> trains = trainRepo.findAll();
        return trains;
    }
}
