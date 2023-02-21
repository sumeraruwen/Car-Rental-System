package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){


        service.saveCustomer(dto);

        return new ResponseUtil("ok","Successsfully saved",null);
    }

    @GetMapping
    public ResponseUtil getAllCustomers(){

        return new ResponseUtil("ok","scuccess loaded",service.getAllCustomers());
    }

}
