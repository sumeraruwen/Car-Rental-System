package lk.ijse.spring.controller;


import lk.ijse.spring.dto.BookingNewDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.BookingService;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService service;


    @PostMapping
    public ResponseUtil saveBooking(@RequestBody BookingNewDTO dto){

        service.saveBooking(dto);

        return new ResponseUtil("ok","Successsfully saved",null);
    }

}
