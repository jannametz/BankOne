package com.telran.bank.service;

import com.telran.bank.dto.TransactionDto.TransactionResponseDto;
import com.telran.bank.dto.TransactionDto.TransactionRequestDto;

import java.util.List;
import java.math.BigDecimal;

public interface TransactionService {
    TransactionResponseDto findTransactionById(String id);

    TransactionResponseDto createTransaction(TransactionRequestDto transactionRequestDto);

    List<TransactionResponseDto> findAllTransactions(String date, List<String> type, String sort);
}
