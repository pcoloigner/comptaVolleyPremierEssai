package org.pcomeziantou.comptavolley.comptavolleybackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Bénéficiaires de nos dépenses, ou clients de nos recettes.
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Stakeholder {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

}
