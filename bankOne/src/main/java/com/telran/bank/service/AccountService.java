package com.telran.bank.service;
import com.telran.bank.dto.AccountDto.AccountRequestDto;
import com.telran.bank.dto.AccountDto.AccountResponseDto;

import java.math.BigDecimal;
import java.util.List;


public interface AccountService {
    AccountResponseDto createAccount(AccountRequestDto accountRequestDto);
    AccountResponseDto getAccountById(String id);
    List<AccountResponseDto> getAllAccounts(String date, String city);
    void makeTransfer(String fromAccount , String toAccount, BigDecimal amount);

    //Service to disable an active account in the system.
    void delete(String id);
}


