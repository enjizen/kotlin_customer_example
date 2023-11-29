package com.wanchalerm.tua.customer.exception

import org.springframework.http.HttpStatus

class DataNotFoundException (
    var code: String? = null,
    override var message: String?,
    var description: String? = null,
    var httpStatus: HttpStatus = HttpStatus.NOT_FOUND,
    throwable: Throwable? = null
) : RuntimeException(message, throwable)