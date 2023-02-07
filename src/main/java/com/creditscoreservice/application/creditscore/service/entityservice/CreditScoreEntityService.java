package com.creditscoreservice.application.creditscore.service.entityservice;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.entity.CreditScore;
import com.creditscoreservice.application.creditscore.repository.CreditScoreRepository;
import com.creditscoreservice.application.creditscore.util.CalculateCreditScore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class CreditScoreEntityService {

    private final CreditScoreRepository creditScoreRepository;
    private final CalculateCreditScore calculateCreditScore;

    public CreditScore save(CreditScore creditScore) {
        return creditScoreRepository.save(creditScore);
    }


    public float getCreditScore() {
        return calculateCreditScore.nextFloat();
    }
}
