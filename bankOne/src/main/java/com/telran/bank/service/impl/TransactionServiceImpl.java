package com.telran.bank.service.impl;

import com.telran.bank.dto.TransactionDto.TransactionResponseDto;
import com.telran.bank.entity.Transaction;
import com.telran.bank.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.telran.bank.repository.TransactionRepository;
import com.telran.bank.mapper.TransactionMapper;

import com.telran.bank.repository.AccountRepository;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;
    private final AccountRepository accountRepository;


}