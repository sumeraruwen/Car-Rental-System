package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleDTO {

    private String vId;
    private String vBrand;
    private String vType;
    private int vSeat;
    private String vFuelType;
    private double vRates;
    private String vFile;
    private String vStatus;
    private String vNumber;
}
