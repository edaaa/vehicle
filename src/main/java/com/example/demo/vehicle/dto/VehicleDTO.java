package com.example.demo.vehicle.dto;

import java.util.UUID;

public class VehicleDTO {
    private long id;
    private String type;

    public VehicleDTO(long id, String type) {
        this.id = id;
        this.type = type;
    }

    public VehicleDTO(long truckEntityId, String color, Double price, int year) {

    }

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
        return "VehicleDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
