package com.example.demo.repository;

import com.example.demo.vehicle.entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleRepository")
public interface VehicleRepository  extends JpaRepository<VehicleEntity, Long> {
}
