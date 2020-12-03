package com.example.demo.vehicle.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table()
public class TruckEntity {


    private long truckEntityID;
    private String color;
    private Double price;
    private int year;

    public TruckEntity() {
    }


    @GeneratedValue(strategy = IDENTITY)
    @Id
    public long getTruckEntityID() {
        return truckEntityID;
    }

    public void setTruckEntityID(long truckEntityID) {
        this.truckEntityID = truckEntityID;
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
        return "TruckEntity{" +
                "truckEntityID=" + truckEntityID +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
