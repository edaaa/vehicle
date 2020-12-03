package com.example.demo.services;

import com.example.demo.repository.VehicleRepository;
import com.example.demo.vehicle.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service()
@EnableAutoConfiguration
public class VehicleServiceImpl  implements VehicleService{


    @Qualifier("vehicleRepository")
    @Autowired(required = true)
    private VehicleRepository vehicleRepository;


    @Override
    public List<VehicleDTO> listAllVehicles() {
        List<VehicleDTO> vehicleList = new ArrayList<>();
        vehicleRepository.findAll().forEach(vehicle -> {
            vehicleList.add(new VehicleDTO(vehicle.getId(), vehicle.getType()));
        });

        return vehicleList;
    }


}
