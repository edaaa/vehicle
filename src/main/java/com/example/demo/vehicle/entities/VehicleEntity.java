package com.example.demo.vehicle.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table()
public class VehicleEntity {


    private long id;
    private String type;

    public VehicleEntity() {
    }
    @GeneratedValue(strategy = IDENTITY)
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VehicleEntity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
