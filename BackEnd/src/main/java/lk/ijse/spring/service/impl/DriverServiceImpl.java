package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveDriver(DriverDTO dto) {
        if(repo.existsById(dto.getdId())){
            throw new RuntimeException("Driver Already Exists");
        }

        Driver map = mapper.map(dto, Driver.class);

        repo.save(map);
    }

    @Override
    public void deleteDriver(String dId) {
        if(!repo.existsById(dId)){
            throw new RuntimeException("Driver ID not Exists");
        }
        repo.deleteById(dId);
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if(!repo.existsById(dto.getdId())){
            throw new RuntimeException("Driver Already Exists");
        }

        Driver map = mapper.map(dto, Driver.class);
        repo.save(map);
    }

    @Override
    public ArrayList<DriverDTO> getAllDrivers() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<DriverDTO>>(){}.getType());
    }
}
