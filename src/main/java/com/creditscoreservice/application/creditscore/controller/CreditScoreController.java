package com.creditscoreservice.application.creditscore.controller;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.dto.CreditScoreDTO;
import com.creditscoreservice.application.creditscore.dto.CreditScoreSaveRequestDTO;
import com.creditscoreservice.application.creditscore.service.CreditScoreService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/credit-score")
public class CreditScoreController {
    private final CreditScoreService creditScoreService;

    public CreditScoreController(CreditScoreService creditScoreService) {
        this.creditScoreService=creditScoreService;
    }

    @PostMapping
    public ResponseEntity<CreditScoreDTO> saveCreditScore(@RequestBody @Valid CreditScoreSaveRequestDTO creditScoreSaveRequestDTO) {
        CreditScoreDTO creditScoreDTO = creditScoreService.saveCreditScore(creditScoreSaveRequestDTO);
        return new ResponseEntity<>(creditScoreDTO, HttpStatus.CREATED);
    }
}
