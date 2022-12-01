package com.example.demo;

import java.util.HashSet;

public interface AccountService {
     HashSet<Account> findAllAccount();
     Account findAccountByID(long id);
     void addAccount(Account b);

}
