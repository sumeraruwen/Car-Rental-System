package lk.ijse.spring.service;

import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ReportsDTO;

import java.util.ArrayList;

public interface BookingService {

    public void saveBooking(BookingDTO dto);
    public ArrayList<ReportsDTO> getAllBookings();
}
