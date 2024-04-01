package com.example.bankingapi.service.impl;

import com.example.bankingapi.dto.AccountDto;
import com.example.bankingapi.entity.Account;
import com.example.bankingapi.mapper.AccountMapper;
import com.example.bankingapi.repository.AccountRepository;
import com.example.bankingapi.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);

        return AccountMapper.maptoAccountDto(savedAccount);
    }
}
