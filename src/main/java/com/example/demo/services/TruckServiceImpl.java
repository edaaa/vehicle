package com.example.demo.services;

import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.TruckRepository;
import com.example.demo.vehicle.dto.TruckDTO;
import com.example.demo.vehicle.entities.TruckEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service()
@EnableAutoConfiguration
public class TruckServiceImpl implements TruckService {


    @Qualifier("truckRepository")
    @Autowired(required = true)
    private TruckRepository truckRepository;

    @Override
    public List<TruckDTO> listAllTrucks() {
        List<TruckDTO> truckList = new ArrayList<>();
        truckRepository.findAll().forEach(truck -> {
            truckList.add(new TruckDTO(truck.getTruckEntityID(),truck.getColor(),truck.getPrice(), truck.getYear()));
        });

        return truckList;
    }

    @Override
    public TruckDTO save(TruckDTO truckDTO) {
        ModelMapper modelMapper = new ModelMapper();
        TruckEntity truckEntity = modelMapper.map(truckDTO, TruckEntity.class);
        truckRepository.save(truckEntity);
        return truckDTO;
    }

    @Override
    public TruckDTO updateTruck(int id, TruckDTO truckUpdateDTO) throws NotFoundException {

        if (truckRepository.findById((long) id).isPresent()){
            TruckEntity existingTruck = truckRepository.findById((long) id).get();
            existingTruck.setColor(truckUpdateDTO.getColor());
            existingTruck.setPrice(truckUpdateDTO.getPrice());
            existingTruck.setYear(truckUpdateDTO.getYear());

            TruckEntity updatedTruckEntity = truckRepository.save(existingTruck);
            return new TruckDTO(updatedTruckEntity.getTruckEntityID(),updatedTruckEntity.getColor(),updatedTruckEntity.getPrice(), updatedTruckEntity.getYear());
        }else{
           throw new NotFoundException();
        }
    }
}
