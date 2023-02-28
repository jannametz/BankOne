package com.telran.bank.repository;

import com.telran.bank.entity.Account;
import com.telran.bank.entity.Transaction;
import com.telran.bank.entity.enums.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
    List<Transaction> findAll();

    List<Transaction> findByType(TransactionType type);

    List<Transaction> findByTypeAndCreationDate(TransactionType type, LocalDateTime dateTime);

    List<Transaction> findById(List<String> transactionId);
    Account findById(String id);
}
