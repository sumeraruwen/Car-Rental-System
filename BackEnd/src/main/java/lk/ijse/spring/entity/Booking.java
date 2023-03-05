package lk.ijse.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Booking {

    @Id
    private String bookingId;
    private String customerEmail;
    private String date;

    @ManyToOne
    @JoinColumn(name = "driverId", referencedColumnName = "dId", updatable = false)
    private Driver driverId;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<Reports> reportsDetails;

}
