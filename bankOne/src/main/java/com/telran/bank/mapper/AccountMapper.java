package com.telran.bank.mapper;

import com.telran.bank.dto.AccountDto.AccountRequestDto;
import com.telran.bank.dto.AccountDto.AccountResponseDto;
import org.mapstruct.Mapper;
import com.telran.bank.entity.Account;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountResponseDto mapToAccountResponseDto(Account account);

    Account mapToAccountCreateEntity(AccountRequestDto accountRequestDto);

    List<AccountResponseDto> accountsToDto(List<Account> accounts);

}
