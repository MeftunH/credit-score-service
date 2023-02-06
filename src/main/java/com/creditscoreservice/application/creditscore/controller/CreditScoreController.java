package com.creditscoreservice.application.creditscore.controller;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.creditscoreservice.application.creditscore.dto.CreditScoreDTO;
import com.creditscoreservice.application.creditscore.dto.CreditScoreSaveRequestDTO;
import com.creditscoreservice.application.creditscore.service.CreditScoreService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/credit-score")
@RequiredArgsConstructor
public class CreditScoreController {
    private final CreditScoreService creditScoreService;

    @PostMapping("/save")
    public ResponseEntity<CreditScoreDTO> saveCreditScore(@RequestBody @Valid CreditScoreSaveRequestDTO creditScoreSaveRequestDTO) {
        CreditScoreDTO creditScoreDTO = creditScoreService.save(creditScoreSaveRequestDTO);
        return new ResponseEntity<>(creditScoreDTO, HttpStatus.CREATED);
    }
}
