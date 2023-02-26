package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.VehicleDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.service.VehicleService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

@RestController
@CrossOrigin
@RequestMapping("/vehicle")
public class VehicleController {


    @Autowired
    private VehicleService service;

   @PostMapping
    public ResponseUtil saveVehicle(@ModelAttribute VehicleDTO dto){

        service.saveVehicle(dto);

        return new ResponseUtil("ok","Successsfully saved",null);
    }

    @DeleteMapping(params = {"vId"})
    public ResponseUtil deleteVehicle(@RequestParam String vId){

        service.deleteVehicle(vId);
        return new ResponseUtil("ok","deleted "+vId,null);
    }

    @PutMapping
    public ResponseUtil updateVehicle(@RequestBody VehicleDTO dto){


        service.updateVehicle(dto);
        return new ResponseUtil("ok","scuccess Updated ",null);
    }



    @GetMapping
    public ResponseUtil getAllVehicle(){

        return new ResponseUtil("ok","scuccess loaded",service.getAllVehicle());
    }


}
