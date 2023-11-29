package com.wanchalerm.tua.customer.controller

import com.wanchalerm.tua.customer.constant.ResponseEnum
import com.wanchalerm.tua.customer.model.request.CustomerRequest
import com.wanchalerm.tua.customer.model.response.ResponseModel
import com.wanchalerm.tua.customer.service.CustomerProfileService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.concurrent.ExecutionException
import org.slf4j.LoggerFactory
import org.springframework.validation.annotation.Validated


@RestController
@RequestMapping("/v1")
class CustomerController(private val customerProfileService: CustomerProfileService) {
    val logger: org.slf4j.Logger = LoggerFactory.getLogger(this::class.java)
    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    @Throws(
        InterruptedException::class,
        ExecutionException::class
    )
    fun getAllCustomerProfiles(): Mono<ResponseEntity<Any>> {
        val customerProfilesResult = customerProfileService.getAll()
        return Mono.just(
            ResponseEntity
                .status(HttpStatus.OK)
                .body(ResponseModel(ResponseEnum.SUCCESS, customerProfilesResult))
        )
    }

    @PostMapping("/customers")
    fun create(@Valid @RequestBody request: CustomerRequest): Mono<ResponseEntity<Any>> {
        return Mono.just(
            ResponseEntity
                .status(HttpStatus.OK)
                .body(ResponseModel(ResponseEnum.SUCCESS, customerProfileService.create(request)))
        )
    }
}