package com.example.twosome.service

import com.example.twosome.domain.account.Account
import com.example.twosome.domain.account.AccountRegisterRequest
import com.example.twosome.domain.account.AccountRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 4:30
 */
@Service
class AccountService constructor(val accountRepository: AccountRepository){
    @Transactional
    fun createAccount(regAcc: AccountRegisterRequest){
        accountRepository.save(Account(
                accountPassword=regAcc.accountPassword,
                accountCountry=regAcc.accountCountry,
                accountMobile=regAcc.accountMobile,
                accountName=regAcc.accountName))
    }
}