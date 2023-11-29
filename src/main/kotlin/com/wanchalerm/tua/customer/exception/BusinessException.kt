package com.wanchalerm.tua.customer.exception

import org.springframework.http.HttpStatus

class BusinessException(
    var code: String? = null,
    override var message: String? = null,
    var description: String? = null,
    var httpStatus: HttpStatus = HttpStatus.CONFLICT,
    throwable: Throwable? = null
) : RuntimeException(message, throwable)
