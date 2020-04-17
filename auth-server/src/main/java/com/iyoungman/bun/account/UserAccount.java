package com.iyoungman.bun.account;

import java.util.List;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * Created by iyoungman on 2020-04-16.
 */

public class UserAccount extends User {

    private Account account;

    public UserAccount(Account account) {
        super(account.getUsername(), account.getPassword(), List.of(new SimpleGrantedAuthority("ROLE_" + account.getRole())));
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
