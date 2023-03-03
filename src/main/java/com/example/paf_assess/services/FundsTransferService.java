package com.example.paf_assess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paf_assess.repositories.AccountRepository;

import com.example.paf_assess.models.Account;


@Service
public class FundsTransferService {
    @Autowired
    private AccountRepository accountRepo;

    public List<Account> findAll()
    {
        return accountRepo.findAll();
    }
}
