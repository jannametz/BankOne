package com.telran.bank.controller;

import com.telran.bank.repository.*;
import com.telran.bank.dto.TransactionDto.TransactionRequestDto;
import com.telran.bank.dto.TransactionDto.TransactionResponseDto;
import com.telran.bank.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @GetMapping("/transactions")
    @ResponseStatus(HttpStatus.OK)
    public List<TransactionResponseDto> getAllTransactions(@RequestParam(value = "date", required = false) String date,
                                                           @RequestParam(value = "type", required = false) List<String> type,
                                                           @RequestParam(value = "sort", required = false) String sort) {
        return transactionService.findAllTransactions(date, type, sort);
    }

    @GetMapping("/transactions/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TransactionResponseDto findAllTransactions(@PathVariable String id) {
        return transactionService.findTransactionById(id);
    }

    @PostMapping("/transactions")
    @ResponseStatus(HttpStatus.CREATED)
    public TransactionResponseDto create(@RequestBody TransactionRequestDto transactionRequestDto) {
        return transactionService.createTransaction(transactionRequestDto);
    }

}
