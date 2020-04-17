package com.iyoungman.bun.runner;

import com.iyoungman.bun.account.Account;
import com.iyoungman.bun.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Created by iyoungman on 2020-04-16.
 */

@Component
public class DataInitRunner implements ApplicationRunner {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        PasswordEncoder passwordEncoder;
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        Account newUser = Account.builder()
                .username("test")
                .password(passwordEncoder.encode("pw"))
                .role("ADMIN")
                .build();

        accountRepository.save(newUser);
    }

}
