package com.wanchalerm.tua.customer.model.entity

import org.springframework.data.relational.core.mapping.Table

@Table(name = "customer_profiles")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
data class CustomerProfile()
