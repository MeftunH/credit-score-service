package com.creditscoreservice.application.creditscore.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CreditScoreSaveRequestDTO implements Serializable {
    @NotNull
    private String customerName;
    @NotNull
    private String customerSurname;
    @NotNull
    private String customerPhoneNumber;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date customerBirthDate;

    private float collateral;
    @NotNull
    private long customerIdentityNumber;
    private long suretyIdentityNumber;
    private String suretyName;

    private String suretySurname;

    private String suretyPhoneNumber;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date suretyBirthDate;

    private String suretyType;


}