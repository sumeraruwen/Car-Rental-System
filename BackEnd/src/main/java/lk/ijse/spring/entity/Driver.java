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
public class Driver {

    @Id
    private String dId;
    private String dName;
    private String dAddress;
    private String dEmail;
    private String dContact;
    private int dAge;
    private String dLicense;
    private String dStatus;

}
