package com.example.demo;

import java.util.HashSet;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
  
    @Autowired
    AccountServiceImpl accountServiceImpl;
  
    @PostMapping("/")
    public void addAccount(@RequestBody Account account) {
        accountServiceImpl.addAccount(account);
    }
  
    @GetMapping("/findall")
    public HashSet<Account> getAllAccount() {
        HashSet<Account> allAccount = accountServiceImpl.findAllAccount();
        return allAccount;

    }
  
    @GetMapping("/findbyid/{id}")
    public Account geAccountById(@PathVariable long id) {
        return accountServiceImpl.findAccountByID(id);
    }
}
