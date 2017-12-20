package com.example.twosome.domain.account

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 4:03
 */
interface AccountRepository : JpaRepository<Account, Long>