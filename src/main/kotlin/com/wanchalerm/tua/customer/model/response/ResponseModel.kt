package com.wanchalerm.tua.customer.model.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.wanchalerm.tua.customer.constant.ResponseEnum
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@JsonPropertyOrder(
    "status",
    "data")
class ResponseModel(responseEnum: ResponseEnum, dataObj: Any? = null) {
     @JsonProperty("status")
     var status: ResponseStatus? = null

     @JsonProperty("data")
     var dataObj: Any? = null

    init {
        status = ResponseStatus(responseEnum.code, responseEnum.message, responseEnum.description)
        when (dataObj) {
            is Mono<*> -> this.dataObj = dataObj.toFuture().get()
            is Flux<*> -> this.dataObj = dataObj.collectList().toFuture().get()
            else -> this.dataObj = dataObj
        }
    }
 }