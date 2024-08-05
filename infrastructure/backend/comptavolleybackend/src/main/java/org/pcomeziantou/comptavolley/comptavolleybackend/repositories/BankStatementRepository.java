package org.pcomeziantou.comptavolley.comptavolleybackend.repositories;

import org.pcomeziantou.comptavolley.comptavolleybackend.entities.BankStatement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankStatementRepository extends JpaRepository<BankStatement, Long> {

}
