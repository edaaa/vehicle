package com.example.demo.services;

import com.example.demo.exception.NotFoundException;
import com.example.demo.vehicle.dto.CarDTO;

import java.util.List;

public interface CarService {

    public List<CarDTO> listAllCars();
    public CarDTO save(CarDTO carDTO);
    public CarDTO updateCar(int id, CarDTO carUpdateDTO) throws NotFoundException;
}
