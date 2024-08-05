package org.pcomeziantou.comptavolley.comptavolleybackend.entities;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.pcomeziantou.comptavolley.comptavolleybackend.enums.DebitCreditType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AccountTransaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private BankAccount account;

    @Enumerated(EnumType.STRING)
    private DebitCreditType type;

    @ManyToOne
    private ImputationAccount imputationAccount;

    private BigDecimal amount;
    private Date operationDate;
    private String description;
    private String reference;
}
