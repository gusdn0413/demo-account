package com.pyolink.account.service;


import com.pyolink.account.model.domain.AccountModel;
import com.pyolink.account.model.entity.AccountEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {

    List<AccountEntity> findAll();

    AccountEntity save(AccountModel account);

    Optional<AccountEntity> findById(Long id);

    boolean existsById(Long id);

    Long count();

    void deleteById(Long id);
}
