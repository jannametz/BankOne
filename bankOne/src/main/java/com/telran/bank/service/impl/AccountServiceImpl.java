package com.telran.bank.service.impl;

import com.telran.bank.dto.AccountDto.AccountRequestDto;
import com.telran.bank.dto.AccountDto.AccountResponseDto;
import com.telran.bank.entity.Account;
import com.telran.bank.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.math.BigDecimal;

import com.telran.bank.repository.AccountRepository;
import com.telran.bank.mapper.AccountMapper;
import com.telran.bank.service.impl.TransactionServiceImpl;

import com.telran.bank.service.AccountService;
import com.telran.bank.mapper.AccountMapper;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;
    private final TransactionServiceImpl transactionServiceImp;

    @Override
    public AccountResponseDto createAccount(AccountRequestDto accountRequestDto) {
        return accountMapper.mapToAccountCreateEntity(accountRepository.save(accountMapper.mapToAccountCreateEntity(accountRequestDto)));

    }
}