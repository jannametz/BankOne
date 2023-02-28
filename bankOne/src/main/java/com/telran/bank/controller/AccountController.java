package com.telran.bank.controller;

import com.telran.bank.dto.AccountDto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.telran.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")

public class AccountController {
    @Autowired
    private AccountService accountService;

    @ResponseStatus
    @PostMapping("/accounts")
    public void createAccount(@RequestBody AccountRequestDto accountRequestDto) {
        accountService.createAccount(accountRequestDto);
    }

    @GetMapping("/accounts")
    @ResponseStatus(HttpStatus.OK)
    public List<AccountResponseDto> getAccounts(@RequestParam(value = "date", required = false, defaultValue = "20") String date,
                                                @RequestParam(value = "city", required = false, defaultValue = "20") String city) {
        return accountService.getAllAccounts(date, city);
    }

    @GetMapping("/accounts/{id}")
    public AccountResponseDto montreAccountById(@PathVariable String id) {
        return accountService.getAccountById(id);
    }

    @PutMapping("/accounts/transferGeld")
    @ResponseStatus(HttpStatus.OK)
    public void transferGeld(@RequestParam(value = "idFrom", required = false, defaultValue = "0") String fromAccount,
                             @RequestParam(value = "idTo", required = false, defaultValue = "20") String toAccount,
                             @RequestParam(value = "amount", required = false) BigDecimal amount) {
        accountService.makeTransfer(fromAccount, toAccount, amount);
    }

    @DeleteMapping(value = "/{accountDelete}")
    public ResponseEntity<?> deleteAccount(@PathVariable("accountDelete") String accountId) {
        accountService.delete(accountId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}