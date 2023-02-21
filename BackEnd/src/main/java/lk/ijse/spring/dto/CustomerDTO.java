package lk.ijse.spring.dto;

public class CustomerDTO {

    String cId;
    String cName;
    String cEmail;
    String cPassword;
    String cAddress;
    String cContact;

    public CustomerDTO() {
    }

    public CustomerDTO(String cId, String cName, String cEmail, String cPassword, String cAddress, String cContact) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.cPassword = cPassword;
        this.cAddress = cAddress;
        this.cContact = cContact;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcContact() {
        return cContact;
    }

    public void setcContact(String cContact) {
        this.cContact = cContact;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cEmail='" + cEmail + '\'' +
                ", cPassword='" + cPassword + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", cContact='" + cContact + '\'' +
                '}';
    }
}

