package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverController {

    @PostMapping
    public ResponseUtil saveDrivers(DriverDTO dto){
        System.out.println(dto.toString());
        return new ResponseUtil("ok","Successsfully saved",null);
    }
}
