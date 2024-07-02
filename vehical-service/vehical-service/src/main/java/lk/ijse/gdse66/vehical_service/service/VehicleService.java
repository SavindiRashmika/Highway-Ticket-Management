package lk.ijse.gdse66.vehical_service.service;

import lk.ijse.gdse66.vehical_service.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    VehicleDTO saveVehicle(VehicleDTO dto);
    VehicleDTO updateVehicle(VehicleDTO dto);
    List<VehicleDTO> getAllVehicle();
    VehicleDTO findById(String id);
}
