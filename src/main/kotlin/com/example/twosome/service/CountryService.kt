package com.example.twosome.service

import com.example.twosome.domain.country.Country
import com.example.twosome.domain.country.CountryRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 3:25
 */
@Service
@Transactional
class CountryService constructor(val countryRepository: CountryRepository){
    fun addToNational(country: Country){
        countryRepository.save(country)
    }
    fun searchCountryCode(countryCode: String): Country {
        return countryRepository.findByCountryCode(countryCode)
    }
    fun searchCountryName(countryName: String): Country {
        return countryRepository.findByCountryName(countryName)
    }
    fun searchCountries(): List<Country>{
        return countryRepository.findAll()
    }
}