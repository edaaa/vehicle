package com.example.demo.services;

import com.example.demo.exception.NotFoundException;
import com.example.demo.vehicle.dto.CarDTO;
import com.example.demo.vehicle.dto.TruckDTO;
import com.example.demo.vehicle.entities.CarEntity;
import com.example.demo.vehicle.entities.TruckEntity;

import java.util.List;

public interface TruckService {
    public List<TruckDTO> listAllTrucks();
    public TruckDTO save(TruckDTO truckDTO);
    public TruckDTO updateTruck(int id, TruckDTO truckUpdateDTO) throws NotFoundException;
}
