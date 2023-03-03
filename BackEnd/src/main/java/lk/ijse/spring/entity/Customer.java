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
public class Customer {


    @Id
    private String cId;
    private String cName;
    private String cEmail;
    private String cPassword;
    private String cAddress;
    private String cContact;

}
