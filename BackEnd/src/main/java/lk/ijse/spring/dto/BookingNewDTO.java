package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookingNewDTO {
    private String bookingId;
    private String date;
    private String cId;

    private List<BookingDetailsDTO> bookingDetails;
}
