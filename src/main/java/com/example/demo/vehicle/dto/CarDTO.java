package com.example.demo.vehicle.dto;

import java.util.UUID;

public class CarDTO extends VehicleDTO{


    private String color;
    private Double price;
    private int year;
    private long carEntityId;

    public CarDTO(long carEntityId, String color, Double price, int year) {
        super(carEntityId, color,price,year);
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public long getCarEntityId() {
        return carEntityId;
    }

    public void setCarEntityId(long carEntityId) {
        this.carEntityId = carEntityId;
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
        return "CarDTO{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", carEntityId=" + carEntityId +
                '}';
    }
}
