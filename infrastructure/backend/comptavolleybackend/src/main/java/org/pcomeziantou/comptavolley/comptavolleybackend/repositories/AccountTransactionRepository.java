package org.pcomeziantou.comptavolley.comptavolleybackend.repositories;

import org.pcomeziantou.comptavolley.comptavolleybackend.entities.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {

}
