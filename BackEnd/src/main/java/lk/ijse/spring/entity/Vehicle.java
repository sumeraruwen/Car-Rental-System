package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Vehicle {

    @Id
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
