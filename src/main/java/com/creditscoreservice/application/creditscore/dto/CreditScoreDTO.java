package com.creditscoreservice.application.creditscore.dto;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CreditScoreDTO implements Serializable {
    private int creditScore;
}
