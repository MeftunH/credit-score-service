package com.creditscoreservice.application.creditscore.service;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.dto.CreditScoreDTO;
import com.creditscoreservice.application.creditscore.dto.CreditScoreSaveRequestDTO;
import com.creditscoreservice.application.creditscore.entity.CreditScore;
import com.creditscoreservice.application.creditscore.mapper.CreditScoreMapper;
import com.creditscoreservice.application.creditscore.service.entityservice.CreditScoreEntityService;
import org.springframework.stereotype.Service;

public interface CreditScoreService {
    CreditScoreDTO saveCreditScore(CreditScoreSaveRequestDTO creditScoreSaveRequestDTO);
}
