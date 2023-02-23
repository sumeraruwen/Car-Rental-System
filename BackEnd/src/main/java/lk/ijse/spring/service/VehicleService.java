package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.VehicleDTO;

import java.util.ArrayList;

public interface VehicleService {

    public void saveVehicle(VehicleDTO dto);
    public void deleteVehicle(String dId);
    public void updateVehicle(VehicleDTO dto);
    public ArrayList<VehicleDTO> getAllVehicle();




}
