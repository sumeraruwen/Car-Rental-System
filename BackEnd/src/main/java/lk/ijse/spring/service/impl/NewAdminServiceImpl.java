package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.NewAdminDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.NewAdmin;
import lk.ijse.spring.repo.NewAdminRepo;
import lk.ijse.spring.service.NewAdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class NewAdminServiceImpl implements NewAdminService {

    @Autowired
    private NewAdminRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveAdmin(NewAdminDTO dto) {

        if(repo.existsById(dto.getAId())){
            throw new RuntimeException("Admin Already Exists");
        }

        NewAdmin map = mapper.map(dto, NewAdmin.class);

        repo.save(map);

    }

    @Override
    public void deleteAdmin(String aId) {
        if(!repo.existsById(aId)){
            throw new RuntimeException("Admin ID not Exists");
        }
        repo.deleteById(aId);
    }

    @Override
    public void updateAdmin(NewAdminDTO dto) {
        if(!repo.existsById(dto.getAId())){
            throw new RuntimeException("Driver Already Exists");
        }

        NewAdmin map = mapper.map(dto, NewAdmin.class);
        repo.save(map);
    }

    @Override
    public ArrayList<NewAdminDTO> getAllAdmin() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<NewAdminDTO>>(){}.getType());
    }
}
