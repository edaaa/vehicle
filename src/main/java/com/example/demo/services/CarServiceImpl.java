package com.example.demo.services;

import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.CarRepository;
import com.example.demo.vehicle.dto.CarDTO;
import com.example.demo.vehicle.entities.CarEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service()
@EnableAutoConfiguration
public class CarServiceImpl implements CarService{

    @Qualifier("carRepository")
    @Autowired(required = true)
    private CarRepository carRepository;

    @Override
    public List<CarDTO> listAllCars() {
        List<CarDTO> carList = new ArrayList<>();
        carRepository.findAll().forEach(car -> {
            carList.add(new CarDTO(car.getCarEntityID(), car.getColor(),car.getPrice(),car.getYear()));
        });
        return carList;
    }

    @Override
    public CarDTO save(CarDTO carDTO) {
        ModelMapper modelMapper = new ModelMapper();
        CarEntity carEntity = modelMapper.map(carDTO, CarEntity.class);
        carRepository.save(carEntity);
        return carDTO;
    }

    @Override
        public CarDTO updateCar(int id, CarDTO carUpdateDTO) throws NotFoundException {

        if (carRepository.findById((long) id).isPresent()){
            CarEntity existingCar = carRepository.findById((long) id).get();
            existingCar.setColor(carUpdateDTO.getColor());
            existingCar.setPrice(carUpdateDTO.getPrice());
            existingCar.setYear(carUpdateDTO.getYear());

            CarEntity updatedCarEntity = carRepository.save(existingCar);
            return new CarDTO(updatedCarEntity.getCarEntityID(), updatedCarEntity.getColor(),updatedCarEntity.getPrice(),updatedCarEntity.getYear());
        }else{
            throw new NotFoundException();
        }
    }
}
