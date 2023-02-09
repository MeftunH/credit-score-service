package com.creditscoreservice.application.creditscore.service.entityservice;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.entity.CreditScore;

public interface CreditScoreEntityService {
    void save(CreditScore creditScore);
     int getCreditScore();
}
