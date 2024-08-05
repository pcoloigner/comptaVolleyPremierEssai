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
public class LineBankStatement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateLineStatement;
    private String label;
    private Date valueDate;

    @Enumerated(EnumType.STRING)
    private DebitCreditType type;
    
    @ManyToOne
    private BankStatement bankStatement;

    private BigDecimal amount;
    private String comment;

}
