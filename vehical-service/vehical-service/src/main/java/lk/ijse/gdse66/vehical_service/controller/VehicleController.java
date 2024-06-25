package lk.ijse.gdse66.vehical_service.controller;

import lk.ijse.gdse66.vehical_service.dto.VehicleDTO;
import lk.ijse.gdse66.vehical_service.service.Impl.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleServiceImpl service;

    @GetMapping
    public List<VehicleDTO> getAllUser(){
        return service.getAllVehicle();
    }

    @PostMapping
    public VehicleDTO saveUser(@RequestBody VehicleDTO dto){
        return service.saveVehicle(dto);
    }

    @PutMapping
    public VehicleDTO updateUser(@RequestBody VehicleDTO dto){
        return service.updateVehicle(dto);
    }
}
