package com.example.demo.controller;

import com.example.demo.exception.NotFoundException;
import com.example.demo.services.CarService;
import com.example.demo.services.TruckService;
import com.example.demo.services.VehicleService;
import com.example.demo.vehicle.dto.CarDTO;
import com.example.demo.vehicle.dto.TruckDTO;
import com.example.demo.vehicle.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class VehicleController {


    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private CarService carService;
    @Autowired
    private TruckService truckService;

    @RequestMapping(value="/vehicle/list",method = RequestMethod.GET)
    public List<VehicleDTO> listALlVehicle() {
        List<VehicleDTO> listALlVehicle = vehicleService.listAllVehicles();
        return listALlVehicle;
    }
    @RequestMapping(value="/car/list" , method = RequestMethod.GET)
    public List<CarDTO> listALlCars() {
        List<CarDTO> listALlCars= carService.listAllCars();
        return listALlCars;
     }
    @RequestMapping(value="/truck/list",method = RequestMethod.GET)
    public List<TruckDTO> listALlTrucks() {
        List<TruckDTO> listALlTrucks = truckService.listAllTrucks();
        return listALlTrucks;
    }

    @RequestMapping(value="/truck/add",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TruckDTO> addTruck(@RequestBody TruckDTO truckDTO)
            throws URISyntaxException {
            TruckDTO truckDTO1= truckService.save(truckDTO);

            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(truckDTO1);


    }


    @RequestMapping(value="/car/add",method=RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CarDTO> addCar(@RequestBody CarDTO carDTO)
            throws URISyntaxException {
           CarDTO carDTO1= carService.save(carDTO);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(carDTO1);

    }

    @PostMapping(value = "/car/update/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CarDTO> updateCar(@PathVariable(value = "id") int id,
                                                         @RequestBody CarDTO carUpdateDto) throws NotFoundException {
        return new ResponseEntity<>(carService.updateCar(id, carUpdateDto), HttpStatus.OK);
    }

    @PostMapping(value = "/truck/update/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<TruckDTO> updateTruck(@PathVariable(value = "id") int id,
                                                @RequestBody TruckDTO truckUpdateDTO) throws NotFoundException {
        return new ResponseEntity<>(truckService.updateTruck(id, truckUpdateDTO), HttpStatus.OK);
    }

}

