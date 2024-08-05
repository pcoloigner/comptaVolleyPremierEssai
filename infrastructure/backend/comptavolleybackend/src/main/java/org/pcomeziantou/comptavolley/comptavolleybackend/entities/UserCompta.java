package org.pcomeziantou.comptavolley.comptavolleybackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Personne rattachée à un compte bancaire
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class UserCompta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String role;
    private String password;

    @ManyToOne
    private Customer customer;

}
