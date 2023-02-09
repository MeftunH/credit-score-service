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
    @SequenceGenerator(name = "creditScoreSeq", sequenceName = "credit_score_id_seq")
    @GeneratedValue(generator="creditScoreSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

   @Column(name = "credit_score", nullable = false)
    private int creditScore;

   @Column(name = "customer_identity_number", nullable = false)
   private long customerIdentityNumber;

}
