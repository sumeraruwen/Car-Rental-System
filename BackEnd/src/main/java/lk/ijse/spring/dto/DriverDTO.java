package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;


public class DriverDTO {

     String dId;
     String dName;
     String dAddress;
     String dEmail;
     String dContact;
     int dAge;
     String dDrivingL;
     String dStatus;

    public DriverDTO() {
    }

    public DriverDTO(String dId, String dName, String dAddress, String dEmail, String dContact, int dAge, String dDrivingL, String dStatus) {
        this.dId = dId;
        this.dName = dName;
        this.dAddress = dAddress;
        this.dEmail = dEmail;
        this.dContact = dContact;
        this.dAge = dAge;
        this.dDrivingL = dDrivingL;
        this.dStatus = dStatus;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail;
    }

    public String getdContact() {
        return dContact;
    }

    public void setdContact(String dContact) {
        this.dContact = dContact;
    }

    public int getdAge() {
        return dAge;
    }

    public void setdAge(int dAge) {
        this.dAge = dAge;
    }

    public String getdDrivingL() {
        return dDrivingL;
    }

    public void setdDrivingL(String dDrivingL) {
        this.dDrivingL = dDrivingL;
    }

    public String getdStatus() {
        return dStatus;
    }

    public void setdStatus(String dStatus) {
        this.dStatus = dStatus;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "dId='" + dId + '\'' +
                ", dName='" + dName + '\'' +
                ", dAddress='" + dAddress + '\'' +
                ", dEmail='" + dEmail + '\'' +
                ", dContact='" + dContact + '\'' +
                ", dAge=" + dAge +
                ", dDrivingL='" + dDrivingL + '\'' +
                ", dStatus='" + dStatus + '\'' +
                '}';
    }
}
