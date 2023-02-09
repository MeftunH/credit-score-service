package com.creditscoreservice.application.creditscore.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CreditScoreSaveRequestDTO implements Serializable {
    @NotNull
    private String customerName;
    @NotNull
    @NotBlank
    private String customerSurname;
    @NotNull
    @NotBlank
    private String customerPhoneNumber;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date customerBirthDate;

    private float collateral;
    @NotNull
    private long customerIdentityNumber;
    private long suretyIdentityNumber;

}