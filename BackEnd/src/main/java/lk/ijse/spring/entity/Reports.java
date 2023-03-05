package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@IdClass(BookingVehicle_PK.class)
public class Reports {

    @Id
    private String bookingId;

    @Id
    private String regNo;
    private String lDate;
    private String rDate;
    private double rentFee;

    @ManyToOne
    @JoinColumn(name = "regNo", referencedColumnName = "regNo", insertable = false, updatable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "bookingId", referencedColumnName = "bookingId", insertable = false, updatable = false)
    private Booking booking;
}
