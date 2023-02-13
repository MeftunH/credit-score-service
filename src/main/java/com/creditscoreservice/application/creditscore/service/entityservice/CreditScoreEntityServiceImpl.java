package com.creditscoreservice.application.creditscore.service.entityservice;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.entity.CreditScore;
import com.creditscoreservice.application.creditscore.repository.CreditScoreRepository;
import com.creditscoreservice.application.creditscore.util.CalculateCreditScore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditScoreEntityServiceImpl implements CreditScoreEntityService{
    private final CreditScoreRepository creditScoreRepository;
    private final CalculateCreditScore calculateCreditScore;

   @Override
    public void save(CreditScore creditScore) {
         creditScoreRepository.save(creditScore);
    }
    @Override
    public int getCreditScore() {
        return calculateCreditScore.nextInt();
    }
}
