package com.creditscoreservice.application.creditscore.service;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.dto.CreditScoreDTO;
import com.creditscoreservice.application.creditscore.dto.CreditScoreSaveRequestDTO;

public interface CreditScoreService {
    CreditScoreDTO saveCreditScore(CreditScoreSaveRequestDTO creditScoreSaveRequestDTO);
}
