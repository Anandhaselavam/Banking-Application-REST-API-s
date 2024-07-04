package net.javaguides.Banking.services;

import net.javaguides.Banking.dto.AccountDto;
import net.javaguides.Banking.entity.Account;

import java.util.List;

public interface AccountServices {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
