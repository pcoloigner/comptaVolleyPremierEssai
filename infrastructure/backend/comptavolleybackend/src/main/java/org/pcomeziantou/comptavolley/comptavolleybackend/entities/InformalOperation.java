package org.pcomeziantou.comptavolley.comptavolleybackend.entities;

import java.util.Date;

import org.springframework.lang.Nullable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe destinée à enregistrer des opérations informelles.
 * Sans être obligé de renseigner toutes les informations précises.
 * Un écran devra ensuite proposer de transformer ces opérations informelles en opérations formelles.
 * 
 * Toutefois, cette classe comprend tous les champs utiles, même s'ils ne sont pas obligatoires.
 * 
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class InformalOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @Nullable
    private BankAccount bankAccount;

    private Date operationDate;
    private String description;
    private String commentaire;


}
