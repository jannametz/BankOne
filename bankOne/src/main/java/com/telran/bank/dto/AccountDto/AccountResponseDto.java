package com.telran.bank.dto.AccountDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import javax.persistence.ElementCollection;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)//NON_NULL attribute to ignore fields with Null values and Include

public class AccountResponseDto {
    private String id;
    @Email
    private String eMail;
    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private BigDecimal amount;
    private LocalDateTime createdDate;
    @ElementCollection //1:n Beziehung
    @ManyToMany
    private List<Long> transactions;
}


