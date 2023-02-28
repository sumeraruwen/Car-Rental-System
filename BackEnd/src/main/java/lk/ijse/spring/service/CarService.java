package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.VehicleDTO;

import java.util.ArrayList;

public interface CarService {

    public void saveCar(CarDTO dto);
    public void deleteCar(String regNo);
    public void updateCar(CarDTO dto);
    public ArrayList<CarDTO> getAllCar();
}
