package lk.ijse.spring.service;


import lk.ijse.spring.dto.BookingNewDTO;
import lk.ijse.spring.dto.DriverDTO;

public interface BookingService {

    public void saveBooking(BookingNewDTO dto);
}
