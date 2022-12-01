package com.example.demo;

import java.util.HashSet;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
  
    HashSet<Account> accountList = new HashSet<Account>();
    @Override
    public HashSet<Account> findAllAccount() {
        if (accountList.isEmpty())
            return null;
        else
            return accountList;
    }
    @Override
    public Account findAccountByID(long id) {
        Account account = accountList.stream().filter(b -> b.getAccNo() == id).findAny().orElse(null);
        return account;
    }
    @Override
    public void addAccount(Account b) {
        accountList.add(b);
    }

}
