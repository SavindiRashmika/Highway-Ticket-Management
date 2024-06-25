package lk.ijse.gdse66.vehical_service.repository;

import lk.ijse.gdse66.vehical_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,String> {
}
