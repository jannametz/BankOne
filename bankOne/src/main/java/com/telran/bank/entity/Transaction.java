package com.telran.bank.entity;

import com.telran.bank.entity.enums.TransactionType;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 15, nullable = false)
    private Long id;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
    @Column(name = "type", length = 50, nullable = false)
    @Convert(converter = TransactionType.class)
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Column(name = "accountFrom", nullable = false)
    private String accountFrom;
    @Column(name = "accountTo", nullable = false)
    private String accountTo;

    @Column(name = "dateTime", length = 50, nullable = false)
    private LocalDateTime dateTime;

    // @Column(name = "dateTime")
    // private Instant dateTime;

    //@ManyToMany


}
