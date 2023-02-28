package com.telran.bank.repository;

import com.telran.bank.entity.Account;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAll();

    List<Account> findByLocalDateTime(LocalDateTime creatDate);

    List<Account> findByCity(String city);

    List<Account> findByCountryAndCity(String country, String city);

    Optional<Account> findAccountById(String accountId);
}
