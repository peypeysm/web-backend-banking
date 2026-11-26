//មុខងារ៖ ទទួល HTTP Request ពី Browser។
package com.spring.banking.controller;

import com.spring.banking.entity.Account;
import com.spring.banking.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account crateAccount(@RequestBody Account account){
        return accountService.saveAccount(account);
    }

    @GetMapping
    public List<Account> getAll(){
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Integer id) {
        return accountService.getAccountById(id);
    }


}