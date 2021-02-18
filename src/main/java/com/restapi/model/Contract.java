package com.restapi.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int numberOfContract;

    Date agreementDate;

    Date updatedAgreementDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
    }

    public Date getUpdatedAgreementDate() {
        return updatedAgreementDate;
    }

    public void setUpdatedAgreementDate(Date updatedAgreementDate) {
        this.updatedAgreementDate = updatedAgreementDate;
    }
}
