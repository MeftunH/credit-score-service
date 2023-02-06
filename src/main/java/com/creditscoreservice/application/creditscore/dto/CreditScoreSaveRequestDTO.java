package com.creditscoreservice.application.creditscore.dto;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class CreditScoreSaveRequestDTO {
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

    private double collateral;

    private long guarantorIdentityNumber;

}
