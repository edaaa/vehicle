package com.example.demo.repository;

import com.example.demo.vehicle.entities.TruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("truckRepository")
public interface TruckRepository extends JpaRepository<TruckEntity, Long> {
}
