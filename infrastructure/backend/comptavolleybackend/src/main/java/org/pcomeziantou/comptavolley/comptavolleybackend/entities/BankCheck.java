package org.pcomeziantou.comptavolley.comptavolleybackend.entities;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe utilisée pour enregistrer les chèques émis.
 * 
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class BankCheck {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;

    @ManyToOne
    private BankAccount bankAccount;

    private Date writeDate;
    private boolean cashed;
    private Date cashedDate;
    private BigDecimal amount;
    private String recipient; // Bénéficiaire du chèque
    
    @ManyToOne
    private Stakeholder recipientStakeholder; // Peut-être pas obligatoire, dans un premier temps.

}
