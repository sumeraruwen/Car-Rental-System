package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDTO;

import java.util.ArrayList;

public interface DriverService {

    public void saveDriver(DriverDTO dto);
    public void deleteDriver(String dId);
    public void updateDriver(DriverDTO dto);
    public ArrayList<DriverDTO> getAllDrivers();


}
