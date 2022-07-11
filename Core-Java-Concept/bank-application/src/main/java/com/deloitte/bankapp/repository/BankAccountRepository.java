package com.deloitte.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.bankapp.entity.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, String>{

}
