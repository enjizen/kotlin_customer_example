package com.wanchalerm.tua.customer.service

import com.wanchalerm.tua.customer.model.entity.CustomerProfileEntity
import com.wanchalerm.tua.customer.model.request.CustomerRequest
import com.wanchalerm.tua.customer.repository.CustomerProfileRepository
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Service
class CustomerProfileService(private val customerProfileRepository: CustomerProfileRepository) {

    fun create(customerRequest: CustomerRequest) : Mono<CustomerProfileEntity> {
        val customerProfileEntity = CustomerProfileEntity()
        BeanUtils.copyProperties(customerRequest, customerProfileEntity)
        customerProfileEntity.active = true
        customerProfileEntity.deleted = false
        return customerProfileRepository.save(customerProfileEntity)
    }


    fun getAll(): Flux<CustomerProfileEntity> {
        return customerProfileRepository.findAll()
    }

    fun getByCode(code: String?): CustomerProfileEntity? {
        return customerProfileRepository.findByCode(code)
    }
}