package com.example.demo.repository;

import com.example.demo.vehicle.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("carRepository")
public interface CarRepository  extends JpaRepository<CarEntity, Long> {
}