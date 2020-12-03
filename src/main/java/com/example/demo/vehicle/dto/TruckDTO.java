package com.example.demo.vehicle.dto;

import java.util.UUID;

public class TruckDTO extends VehicleDTO {

    private String color;
    private Double price;
    private int year;
    private long truckEntityId;

    public TruckDTO(long truckEntityId,String color, Double price, int year) {
        super(truckEntityId,color,price,year);
        this.truckEntityId =truckEntityId;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public long getTruckEntityId() {
        return truckEntityId;
    }

    public void setTruckEntityId(long truckEntityId) {
        this.truckEntityId = truckEntityId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "TruckDTO{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", truckEntityId=" + truckEntityId +
                '}';
    }
}
