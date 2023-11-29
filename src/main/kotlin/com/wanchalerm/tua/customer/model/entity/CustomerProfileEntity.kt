package com.wanchalerm.tua.customer.model.entity

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.io.Serializable
import java.time.LocalDate
import java.time.LocalDateTime
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "profiles")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
 class CustomerProfileEntity : Serializable {
    @Id
    var id: Int? = null

    @Column("code")
    var code: String? = null

    @Column("first_name")
    var firstName: String? = null

    @Column("last_name")
    var lastName: String? = null

    @Column("birth_date")
    var birthDate: LocalDate? = null

    @Column("mobile_number")
    var mobileNumber: String? = null

    @Column("email")
    var email: String? = null

    @Column("created_date_time")
    var createdDateTime: LocalDateTime? = null

    @Column("updated_date_time")
    var updatedDateTime: LocalDateTime? = null

    @Column("is_active")
    var active: Boolean? = null

    @Column("is_deleted")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    var deleted: Boolean? = null
}
