package com.telran.bank.util;
import com.telran.bank.dto.persistence.FullName;
import com.telran.bank.entity.Account;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@NonNull
public class EntityCreator {
    public static Account getAccountOne() {
        return Account.builder()
                .id("12345678")
                .creatDate(LocalDateTime.parse("2023-02-09 12:30"))
                .eMail("percy@hotmail.com")
                .city("Berlin")
                .country("Germany")
                .firstName("Max")
                .lastName("Bank")
                .amount(BigDecimal.valueOf(500.400))
                .build();
    }
}
