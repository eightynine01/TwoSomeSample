package com.example.twosome.web

import com.example.twosome.service.AccountService
import com.example.twosome.service.CountryService
import org.springframework.stereotype.Controller

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 4:50
 */
@Controller
class AccountController constructor(val accountService: AccountService, val countryService: CountryService){
    fun filterAccountByCountry(accountService: AccountService){}
}