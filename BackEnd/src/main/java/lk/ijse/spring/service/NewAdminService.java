package lk.ijse.spring.service;

import lk.ijse.spring.dto.NewAdminDTO;
import lk.ijse.spring.dto.VehicleDTO;

import java.util.ArrayList;

public interface NewAdminService {

    public void saveAdmin(NewAdminDTO dto);
    public void deleteAdmin(String aId);
    public void updateAdmin(NewAdminDTO dto);
    public ArrayList<NewAdminDTO> getAllAdmin();




}
