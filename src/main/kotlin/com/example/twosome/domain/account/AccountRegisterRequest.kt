package com.example.twosome.domain.account

import com.example.twosome.domain.country.Country
import com.example.twosome.domain.mobile.Mobile

/**
 * Created by TaeHwan
 * 2017. 12. 20. PM 5:09
 */
data class AccountRegisterRequest(
        var accountName: String = "",
        var accountPassword: String = "",
        var accountCountry: Country,
        var accountMobile: Mobile
        )