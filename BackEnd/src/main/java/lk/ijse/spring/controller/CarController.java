package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.VehicleDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.service.impl.CarServiceImpl;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseUtil saveCar(CarDTO carDTO, @RequestPart("carImage") MultipartFile file1) {

        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
//            System.out.println(projectPath);
            uploadsDir.mkdir();
            file1.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + file1.getOriginalFilename()));

            carDTO.setCarImageUrl("uploads/"+file1.getOriginalFilename());
            carService.saveCar(carDTO);

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            return new ResponseUtil("Ok", "Successfully Saved", null);
        }

        System.out.println(carDTO);
        return new ResponseUtil("Ok", "Successfully Saved", null);

    }

    @GetMapping
    public ResponseUtil getCar() {
        return new ResponseUtil("Ok", "Successfully Loaded", carService.getAllCar());
    }


    @DeleteMapping(params = {"regNo"})
    public ResponseUtil deleteCar(@RequestParam String regNo){

        carService.deleteCar(regNo);
        return new ResponseUtil("ok","deleted "+regNo,null);
    }

    @PutMapping
    public ResponseUtil updateCar(@RequestBody CarDTO dto){


        carService.updateCar(dto);
        return new ResponseUtil("ok","scuccess Updated ",null);
    }
}
