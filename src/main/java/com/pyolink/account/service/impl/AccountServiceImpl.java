package com.pyolink.account.service.impl;

import com.pyolink.account.model.domain.AccountModel;
import com.pyolink.account.model.entity.AccountEntity;
import com.pyolink.account.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public List<AccountEntity> findAll() {
        return List.of();
    }

    @Override
    public AccountEntity save(AccountModel account) {
        return null;
    }

    @Override
    public Optional<AccountEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Long count() {
        return 0L;
    }

    @Override
    public void deleteById(Long id) {
    }
}
