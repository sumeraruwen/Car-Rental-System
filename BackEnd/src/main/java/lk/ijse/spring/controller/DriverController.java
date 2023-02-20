package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverController {


    @Autowired
    private DriverService service;

    @PostMapping
    public ResponseUtil saveDriver(@ModelAttribute DriverDTO dto){

       /* if(repo.existsById(dto.getdId())){
            throw new RuntimeException("Driver Already Exists");
        }

        Driver map = mapper.map(dto, Driver.class);

      //  Driver driver = new Driver(dto.getdId(), dto.getdName(), dto.getdAddress(), dto.getdEmail(), dto.getdContact(),dto.getdAge(),dto.getdDrivingL() , dto.getdStatus());
        repo.save(map);*/
        service.saveDriver(dto);

        return new ResponseUtil("ok","Successsfully saved",null);
    }

    @DeleteMapping(params = {"dId"})
    public ResponseUtil deleteDriver(@RequestParam String dId){

       /* if(!repo.existsById(dId)){
            throw new RuntimeException("Driver ID not Exists");
        }
        repo.deleteById(dId);*/
        service.deleteDriver(dId);
        return new ResponseUtil("ok","deleted "+dId,null);
    }

    @PutMapping
    public ResponseUtil updateDriver(@RequestBody DriverDTO dto){

        /*if(!repo.existsById(dto.getDId())){
            throw new RuntimeException("Driver ID not Exists");
        }


        System.out.println(dto.toString());

        Driver driver = new Driver(dto.getdId(), dto.getDName(), dto.getDAddress(), dto.getDEmail(), dto.getDContact(),dto.getDAge(),dto.getDDrivingL() , dto.getDStatus());
        repo.save(driver);*/

       /* if(!repo.existsById(dto.getdId())){
            throw new RuntimeException("Driver Already Exists");
        }

        Driver map = mapper.map(dto, Driver.class);
        repo.save(map);*/

        service.updateDriver(dto);
        return new ResponseUtil("ok","scuccess Updated ",null);
    }

    @GetMapping
    public ResponseUtil getAllDriver(){

        //List<Driver> all = repo.findAll();
/*
      ArrayList<DriverDTO> allList =  mapper.map(repo.findAll(),new TypeToken<ArrayList<DriverDTO>>(){}.getType());
*/


        return new ResponseUtil("ok","scuccess loaded",service.getAllDrivers());
    }
}
