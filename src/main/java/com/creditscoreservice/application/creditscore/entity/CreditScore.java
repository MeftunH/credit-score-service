package com.creditscoreservice.application.creditscore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

@Entity
@Table(name = "credit_score")
@Getter
@Setter
public class CreditScore {
    @Id
    @SequenceGenerator(name = "creditScoreSeq", sequenceName = "credit_score_seq")
    private Long id;

   @Column(name = "creditScore", nullable = false)
    private int creditScore;

}
