package com.creditscoreservice.application.creditscore.service;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.dto.CreditScoreDTO;
import com.creditscoreservice.application.creditscore.dto.CreditScoreSaveRequestDTO;
import com.creditscoreservice.application.creditscore.entity.CreditScore;
import com.creditscoreservice.application.creditscore.mapper.CreditScoreMapper;
import com.creditscoreservice.application.creditscore.service.entityservice.CreditScoreEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditScoreService {
    private final CreditScoreEntityService creditScoreEntityService;
    public CreditScoreDTO save(CreditScoreSaveRequestDTO creditScoreSaveRequestDTO) {
        CreditScore creditScore = CreditScoreMapper.INSTANCE.convertToCreditScore(creditScoreSaveRequestDTO);
        return CreditScoreMapper.INSTANCE.convertToCreditScoreDTO(creditScore);
    }
}
