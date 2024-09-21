package com.Rail.IRCTC.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "trains")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainId;
    private int trainNo;
    private String source;
    private String destination;

    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
    private List<Passenger> passengers;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrders;

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
