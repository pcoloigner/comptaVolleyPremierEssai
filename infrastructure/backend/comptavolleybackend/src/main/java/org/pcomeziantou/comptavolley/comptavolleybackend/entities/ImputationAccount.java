package org.pcomeziantou.comptavolley.comptavolleybackend.entities;

import org.pcomeziantou.comptavolley.comptavolleybackend.enums.DebitCreditType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Les comptes d'imputation de dépenses ou de recettes.
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class ImputationAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String description;
    
    @Enumerated(EnumType.STRING)
    private DebitCreditType type;
}
