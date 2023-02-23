package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;


public class NewAdminDTO {

    private String aId;
    private String aName;
    private String aEmail;
    private String aPassword;

    public NewAdminDTO() {
    }

    public NewAdminDTO(String aId, String aName, String aEmail, String aPassword) {
        this.aId = aId;
        this.aName = aName;
        this.aEmail = aEmail;
        this.aPassword = aPassword;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    @Override
    public String toString() {
        return "NewAdminDTO{" +
                "aId='" + aId + '\'' +
                ", aName='" + aName + '\'' +
                ", aEmail='" + aEmail + '\'' +
                ", aPassword='" + aPassword + '\'' +
                '}';
    }
}
