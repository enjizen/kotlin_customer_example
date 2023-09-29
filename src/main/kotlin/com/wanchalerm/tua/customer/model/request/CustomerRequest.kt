package com.wanchalerm.tua.customer.model.request

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate

data class CustomerRequest (
    @JsonProperty("first_name")
    val firstName: String,
    @JsonProperty("last_name")
    val lastName: String,
    @JsonProperty("birth_date")
    val birthDate: LocalDate,
    @JsonProperty("mobile_number")
    val mobileNumber: String,
    val email: String
)