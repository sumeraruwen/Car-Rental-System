package lk.ijse.spring.service.impl;


import lk.ijse.spring.dto.BookingNewDTO;

import lk.ijse.spring.entity.BookingNew;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.Vehicle;
import lk.ijse.spring.repo.*;
import lk.ijse.spring.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private BookingRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveBooking(BookingNewDTO dto) {
        System.out.println("Save Bookkingggg");
        System.out.println(dto.toString());

        BookingNew ord = mapper.map(dto,BookingNew.class);
        if(repo.existsById(dto.getBookingId())){
            throw new RuntimeException("Order Id Not Exists ");
        }

        repo.save(ord);

        // dto.setBookingId(getNewBookingId());
      /*  if (!bookingRepo.existsById(dto.getBookingId())) {
            bookingRepo.save(mapper.map(dto, Booking.class));

            if (dto.getVehicle() == null) {
                throw new RuntimeException("No vehicle added the booking");
            }else {
                Car car = dto.getVehicle();
                System.out.println(car.getRegNo()+" select");
                //car.setStatus("Selected");
                carRepo.save(car);

                if (dto.getDriver() != null){
                    Driver driver = dto.getDriver();
                }
            }

        } else {
            throw new RuntimeException("Booking Already Exist..!");
        }*/

    }
}
