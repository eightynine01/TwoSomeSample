package com.example.twosome

import com.example.twosome.domain.account.AccountRegisterRequest
import com.example.twosome.domain.country.Country
import com.example.twosome.domain.mobile.Mobile
import com.example.twosome.service.AccountService
import com.example.twosome.service.CountryService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.slf4j.LoggerFactory

@SpringBootApplication
class TwosomeApplication{
    private val log = LoggerFactory.getLogger(TwosomeApplication::class.java)

    @Bean
    fun init(countryService: CountryService,accountService: AccountService) = CommandLineRunner {
        countryService.addToNational(Country(countryName = "대한민국", countryCode = "KR"))
        countryService.addToNational(Country(countryName = "필리핀", countryCode = "PH"))
        countryService.addToNational(Country(countryName = "베트남", countryCode = "VN"))

        val country = countryService.searchCountryCode("KR")

        log.info("searchAllNations : {}", countryService.searchCountries())
        log.info("searchNationalCode('KR') : {}", country)
        log.info("searchNationalName('대한민국') : {}", countryService.searchCountryName("대한민국"))

        accountService.createAccount(AccountRegisterRequest(accountName = "test1Name",accountPassword = "test1Pass",accountMobile = Mobile("010-1234-5678"),accountCountry = country))
    }
}

fun main(args: Array<String>){
    SpringApplication.run(TwosomeApplication::class.java, *args)
}