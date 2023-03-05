package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReportsDTO {

    private String bookingId;
    private String lDate;
    private String rDate;
    private String regNo;
    private double rentFee;
}
