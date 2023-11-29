package com.wanchalerm.tua.customer.repository

import com.wanchalerm.tua.customer.model.entity.CustomerProfileEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository


@Repository
interface CustomerProfileRepository : ReactiveCrudRepository<CustomerProfileEntity, Int> {
}