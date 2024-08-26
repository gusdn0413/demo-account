package com.pyolink.account.controller;

import com.pyolink.account.model.domain.AccountModel;
import com.pyolink.account.model.entity.AccountEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account/")
public class AccountController {

    public List<AccountModel> findAll() {
        return List.of();
    }

    public AccountEntity save(AccountModel account) {
        return null;
    }

    public Optional<AccountModel> findById(Long id) {
        return Optional.empty();
    }

    public boolean existsById(Long id) {
        return false;
    }

    public Long count() {
        return 0L;
    }

    public void deleteById(Long id) {

    }
}