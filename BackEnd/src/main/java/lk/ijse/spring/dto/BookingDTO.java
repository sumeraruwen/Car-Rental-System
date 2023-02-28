package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookingDTO {

    private String bookingId;
    private String bookingDate;
    private String leavingDate;
    private String returnDate;
    private double rentalFee;

    private Customer customer;
    private Car vehicle;
    private Driver driver;
}

