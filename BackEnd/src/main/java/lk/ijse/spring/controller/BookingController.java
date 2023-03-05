package lk.ijse.spring.controller;

import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.entity.Booking;
import lk.ijse.spring.repo.BookingRepo;
import lk.ijse.spring.service.BookingService;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

  /*  @Autowired
    private BookingRepo repo;

    @Autowired
    private ModelMapper mapper;*/

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseUtil bookingSave(@RequestBody BookingDTO dto){
       /*// System.out.println(dto.toString());
        Booking book = mapper.map(dto, Booking.class);
        if(repo.existsById(book.getBookingId())){
            throw new RuntimeException("Already Exists Id");
        }
        repo.save(book);*/
        bookingService.saveBooking(dto);
        return new ResponseUtil("ok","Successfully Book",null);
    }
}
