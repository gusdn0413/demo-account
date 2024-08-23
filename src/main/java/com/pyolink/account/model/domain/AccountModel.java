package com.pyolink.account.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AccountModel {
    private Long id;
    private float balance;
    private int accountNumber;
}
