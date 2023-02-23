package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.VehicleDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.Vehicle;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.repo.VehicleRepo;
import lk.ijse.spring.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveVehicle(VehicleDTO dto) {

        if(repo.existsById(dto.getVId())){
            throw new RuntimeException("Vehicle Already Exists");
        }

        Vehicle map = mapper.map(dto, Vehicle.class);

        repo.save(map);
    }

    @Override
    public void deleteVehicle(String vId) {
        if(!repo.existsById(vId)){
            throw new RuntimeException("Vehicle ID not Exists");
        }
        repo.deleteById(vId);
    }

    @Override
    public void updateVehicle(VehicleDTO dto) {
        if(!repo.existsById(dto.getVId())){
            throw new RuntimeException("Driver Already Exists");
        }

        Vehicle map = mapper.map(dto, Vehicle.class);
        repo.save(map);
    }

    @Override
    public ArrayList<VehicleDTO> getAllVehicle() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<VehicleDTO>>(){}.getType());
    }
}
