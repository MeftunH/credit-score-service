package com.creditscoreservice.application.creditscore.repository;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.entity.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditScoreRepository extends JpaRepository<CreditScore, Long> {
}
