package com.telran.bank.mapper;

import com.telran.bank.entity.Transaction;
import com.telran.bank.dto.TransactionDto.*;
import com.telran.bank.entity.Transaction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionResponseDto mapToTransactionDto(Transaction transaction);

    List<TransactionResponseDto> mapToTransactionsToTransactionDTOs(List<Transaction> transactions);
}


