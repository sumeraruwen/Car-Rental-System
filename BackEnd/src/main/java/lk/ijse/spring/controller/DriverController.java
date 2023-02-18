package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class DriverController {

    @PostMapping
    public ResponseUtil saveDrivers(@ModelAttribute DriverDTO dto){
        System.out.println(dto.toString());
        return new ResponseUtil("ok","Successsfully saved",null);
    }

    @DeleteMapping(params = {"dId"})
    public ResponseUtil deleteDriver(@RequestParam String dId){
        return new ResponseUtil("ok","deleted "+dId,null);
    }

    @PutMapping
    public ResponseUtil updateDriver(@RequestBody DriverDTO dto){
        return new ResponseUtil("ok","scuccess Updated ",null);
    }

    @GetMapping
    public ResponseUtil getAllDrivers(){
        ArrayList<DriverDTO> arrayList= new ArrayList<>();
        arrayList.add(new DriverDTO("D001","sup","colombo","sff","sdfsdf",45,"dfs","sdf"));
        arrayList.add(new DriverDTO("D002","vik","colombo","sff","sdfsdf",45,"dfs","sdf"));
        arrayList.add(new DriverDTO("D003","sum","colombo","sff","sdfsdf",45,"dfs","sdf"));
        arrayList.add(new DriverDTO("D004","ven","colombo","sff","sdfsdf",45,"dfs","sdf"));
        arrayList.add(new DriverDTO("D005","ruw","colombo","sff","sdfsdf",45,"dfs","sdf"));
        return new ResponseUtil("ok","scuccess loaded",arrayList);
    }
}
