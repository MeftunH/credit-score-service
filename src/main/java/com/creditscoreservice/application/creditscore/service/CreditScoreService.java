package com.creditscoreservice.application.creditscore.service;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.dto.CreditScoreDTO;
import com.creditscoreservice.application.creditscore.dto.CreditScoreSaveRequestDTO;
import com.creditscoreservice.application.creditscore.entity.CreditScore;
import com.creditscoreservice.application.creditscore.mapper.CreditScoreMapper;
import com.creditscoreservice.application.creditscore.service.entityservice.CreditScoreEntityService;
import org.springframework.stereotype.Service;

@Service
public class CreditScoreService {

    private final CreditScoreEntityService creditScoreEntityService;
    private int _creditScore;

    public CreditScoreService(CreditScoreEntityService creditScoreEntityService) {
        this.creditScoreEntityService=creditScoreEntityService;
    }

    public CreditScoreDTO getCreditScore(CreditScoreSaveRequestDTO creditScoreSaveRequestDTO) {
        CreditScore creditScore = CreditScoreMapper.INSTANCE.convertToCreditScore(creditScoreSaveRequestDTO);
        creditScore.setCreditScore(creditScoreEntityService.getCreditScore());
        _creditScore = creditScore.getCreditScore();
        saveCreditScore();
        return CreditScoreMapper.INSTANCE.convertToCreditScoreDTO(creditScore);
    }
    private void saveCreditScore() {
        CreditScore creditScore = new CreditScore();
        creditScore.setCreditScore(_creditScore);
        creditScoreEntityService.save(creditScore);
    }
}
