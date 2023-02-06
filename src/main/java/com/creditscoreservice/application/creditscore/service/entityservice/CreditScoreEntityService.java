package com.creditscoreservice.application.creditscore.service.entityservice;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.entity.CreditScore;
import com.creditscoreservice.application.creditscore.repository.CreditScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditScoreEntityService {
    private final CreditScoreRepository creditScoreRepository;

    public CreditScore save(CreditScore creditScore) {
        return creditScoreRepository.save(creditScore);
    }
}
