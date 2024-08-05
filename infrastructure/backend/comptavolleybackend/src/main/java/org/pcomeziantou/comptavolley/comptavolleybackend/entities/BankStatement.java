package org.pcomeziantou.comptavolley.comptavolleybackend.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BankStatement = Relevé bancaire
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class BankStatement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long number;
    private Date beginningDateStatement;
    private Date endingDateStatement;

    @ManyToOne
    private BankAccount account;
    
    @OneToMany(mappedBy = "bankStatement")
    private List<LineBankStatement> lines = new ArrayList<>();
    
    @OneToOne(mappedBy = "bankStatement")
    private LineBankStatement oldBalance;
    @OneToOne(mappedBy = "bankStatement")
    private LineBankStatement newBalance;
    
}
