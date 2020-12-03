package com.example.demo.vehicle.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table()
public class CarEntity {

    private long carEntityID;
    private String color;
    private Double price;
    private int year;

    public CarEntity() {

    }

    @GeneratedValue(strategy = IDENTITY)
    @Id
    public long getCarEntityID() {
        return carEntityID;
    }

    public void setCarEntityID(long carEntityID) {
        this.carEntityID = carEntityID;
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
        return "CarEntity{" +
                "carEntityID=" + carEntityID +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
