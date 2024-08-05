package org.pcomeziantou.comptavolley.comptavolleybackend.repositories;

import org.pcomeziantou.comptavolley.comptavolleybackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {   

}
