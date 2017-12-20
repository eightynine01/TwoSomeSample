package com.example.twosome.domain.country

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 2:51
 */
@Entity
data class Country(
        @Id @GeneratedValue
        private var countryId: Long? = -1,
        private var countryName: String,
        private var countryCode: String
)