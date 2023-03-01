package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BookingNew {

    @Id
    private String bookingId;
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "customerId",referencedColumnName = "cId",nullable = false)
    private Customer cId;
    private String date;

    @OneToMany(mappedBy = "bookingNew",cascade = CascadeType.ALL)
    private List<BookingDetails> bookingDetails;

}
