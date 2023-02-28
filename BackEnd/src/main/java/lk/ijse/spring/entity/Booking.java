package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Booking {

    @Id
    private String bookingId;
    private String bookingDate;
    private String leavingDate;
    private String returnDate;
    private double rentalFee;


    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "cId",referencedColumnName = "cId",nullable = false)
    private Customer customer;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "regNo",referencedColumnName = "regNo",nullable = false)
    private Car car;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "dId",referencedColumnName = "dId")
    private Driver driver;

}
