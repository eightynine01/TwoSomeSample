package com.example.twosome.domain.country

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 3:24
 */
interface CountryRepository : JpaRepository<Country, Long>{
    fun findByCountryName(name: String): Country
    fun findByCountryCode(code: String): Country
}