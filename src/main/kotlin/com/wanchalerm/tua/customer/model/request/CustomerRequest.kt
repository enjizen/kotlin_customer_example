package com.wanchalerm.tua.customer.model.request

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import java.time.LocalDate

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
class CustomerRequest {
    @NotBlank
    val firstName: String? = null

    @NotBlank
    val lastName: String? = null

    @NotNull
    //@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}")
    val birthDate: LocalDate? = null

    @NotBlank
    @Pattern(regexp = "^[0-9]+$")
    @Size(min = 10, max = 10)
    val mobileNumber: String? = null

    @Email
    val email: String? = null
}