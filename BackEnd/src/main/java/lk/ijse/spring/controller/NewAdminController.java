package lk.ijse.spring.controller;

import lk.ijse.spring.dto.NewAdminDTO;
import lk.ijse.spring.dto.VehicleDTO;
import lk.ijse.spring.service.NewAdminService;
import lk.ijse.spring.service.VehicleService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/newAdmin")
public class NewAdminController {


    @Autowired
    private NewAdminService service;

    @PostMapping
    public ResponseUtil saveAdmin(@ModelAttribute NewAdminDTO dto){

        service.saveAdmin(dto);

        return new ResponseUtil("ok","Successsfully saved",null);
    }

    @DeleteMapping(params = {"aId"})
    public ResponseUtil deleteAdmin(@RequestParam String aId){

        service.deleteAdmin(aId);
        return new ResponseUtil("ok","deleted "+aId,null);
    }

    @PutMapping
    public ResponseUtil updateAdmin(@RequestBody NewAdminDTO dto){


        service.updateAdmin(dto);
        return new ResponseUtil("ok","scuccess Updated ",null);
    }

    @GetMapping
    public ResponseUtil getAllAdmin(){

        return new ResponseUtil("ok","scuccess loaded",service.getAllAdmin());
    }




}
