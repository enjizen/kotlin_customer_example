package com.wanchalerm.tua.customer.service

import com.wanchalerm.tua.customer.model.entity.CustomerProfileEntity
import com.wanchalerm.tua.customer.model.request.CustomerRequest
import com.wanchalerm.tua.customer.repository.CustomerProfileRepository
import java.time.LocalDateTime
import java.util.UUID
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Service
class CustomerProfileService(private val customerProfileRepository: CustomerProfileRepository) {
    val logger: Logger = LoggerFactory.getLogger(this::class.java)

    fun create(customerRequest: CustomerRequest) : Mono<CustomerProfileEntity> {
       logger.info("Create customer")
        CustomerProfileEntity().apply {
            BeanUtils.copyProperties(customerRequest, this)
            val currentDateTime = LocalDateTime.now()
            code = UUID.randomUUID().toString()
            createdDateTime = currentDateTime
            updatedDateTime = currentDateTime
            active = true
            deleted = false
        }.run {
            return customerProfileRepository.save(this)
        }
    }


    fun getAll(): Flux<CustomerProfileEntity> {
        return customerProfileRepository.findAll()
    }

    fun getByCode(code: String?): CustomerProfileEntity? {
        return customerProfileRepository.findByCode(code)
    }
}