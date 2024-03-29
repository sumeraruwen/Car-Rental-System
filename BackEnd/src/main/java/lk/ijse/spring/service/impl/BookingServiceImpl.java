package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ReportsDTO;
import lk.ijse.spring.entity.Booking;
import lk.ijse.spring.repo.BookingRepo;
import lk.ijse.spring.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveBooking(BookingDTO dto) {

        // System.out.println(dto.toString());
        Booking book = mapper.map(dto, Booking.class);
        if(repo.existsById(book.getBookingId())){
            throw new RuntimeException("Already Exists Id");
        }

        repo.save(book);

    }

    @Override
    public ArrayList<ReportsDTO> getAllBookings() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<ReportsDTO>>(){}.getType());
    }
}
