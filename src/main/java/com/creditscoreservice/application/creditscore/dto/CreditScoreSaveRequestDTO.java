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
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date customerBirthDate;
    @NotNull
    private long customerIdentityNo;


}