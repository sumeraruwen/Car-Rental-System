package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDTO;

import java.util.ArrayList;

public interface CustomerService {

    public void saveCustomer(CustomerDTO dto);
    public ArrayList<CustomerDTO> getAllCustomers();
}
