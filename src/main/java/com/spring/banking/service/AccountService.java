//មុខងារ៖ សម្រាប់សរសេរ Business Logic ដូចជា Deposit, Withdraw និង Transfer។
package com.spring.banking.service;

import com.spring.banking.entity.Account;
import com.spring.banking.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account saveAccount(Account account){
        return accountRepository.save(account);
    }
//    public Account createAccount(Account account) {
//        return accountRepository.save(account);
//
//    }
    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    public Account getAccountById(Integer id) {
        return accountRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Account not found with ID: " + id)
                );
    }
    }
