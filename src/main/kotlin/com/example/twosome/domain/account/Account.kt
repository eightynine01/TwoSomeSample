package com.example.twosome.domain.account

import com.example.twosome.domain.mobile.Mobile
import com.example.twosome.domain.country.Country
import javax.persistence.*

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 2:40
 */
@Entity
data class Account(
        @Id @GeneratedValue
        var accountId: Long? = -1,
        var accountName: String,
        var accountPassword: String,
        @OneToOne
        var accountCountry: Country,
        @Embedded
        var accountMobile: Mobile
)