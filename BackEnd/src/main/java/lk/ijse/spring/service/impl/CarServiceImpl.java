package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.VehicleDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.NewAdmin;
import lk.ijse.spring.entity.Vehicle;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.repo.VehicleRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveCar(CarDTO dto) {
        if(repo.existsById(dto.getRegNo())){
            throw new RuntimeException("Car Already Exists");
        }

        Car map = mapper.map(dto, Car.class);

        repo.save(map);
    }

    @Override
    public void deleteCar(String regNo) {
        if(!repo.existsById(regNo)){
            throw new RuntimeException("Car ID not Exists");
        }
        repo.deleteById(regNo);
    }

    @Override
    public void updateCar(CarDTO dto) {
        if(!repo.existsById(dto.getRegNo())){
            throw new RuntimeException("Vehicle Already Exists");
        }

        Car map = mapper.map(dto, Car.class);
        repo.save(map);
    }

    @Override
    public ArrayList<CarDTO> getAllCar() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }
}
