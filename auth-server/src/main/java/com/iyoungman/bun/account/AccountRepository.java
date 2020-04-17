package com.iyoungman.bun.account;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by iyoungman on 2020-04-16.
 */

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUsername(String username);
}
