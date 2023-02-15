package com.creditscoreservice.application.creditscore.service;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.dto.CreditScoreDTO;
import com.creditscoreservice.application.creditscore.dto.CreditScoreSaveRequestDTO;
import com.creditscoreservice.application.creditscore.entity.CreditScore;
import com.creditscoreservice.application.creditscore.mapper.CreditScoreMapper;
import com.creditscoreservice.application.creditscore.service.entityservice.CreditScoreEntityService;
import org.springframework.stereotype.Service;

@Service
public class CreditScoreServiceImpl implements CreditScoreService {

    private final CreditScoreEntityService creditScoreEntityService;

    public CreditScoreServiceImpl(CreditScoreEntityService creditScoreEntityService) {
        this.creditScoreEntityService=creditScoreEntityService;
    }

    public CreditScoreDTO saveCreditScore(CreditScoreSaveRequestDTO creditScoreSaveRequestDTO) {
        CreditScore creditScore = CreditScoreMapper.INSTANCE.convertToCreditScore(creditScoreSaveRequestDTO);
        creditScore.setCreditScore(creditScoreEntityService.getCreditScore());
        creditScore.setCustomerIdentityNo(creditScoreSaveRequestDTO.getCustomerIdentityNo());
        creditScoreEntityService.save(creditScore);
        return CreditScoreMapper.INSTANCE.convertToCreditScoreDTO(creditScore);
    }
}
