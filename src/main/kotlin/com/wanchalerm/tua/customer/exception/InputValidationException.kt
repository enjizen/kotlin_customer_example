package com.wanchalerm.tua.customer.exception

import org.springframework.http.HttpStatus

class InputValidationException(
    var code: String? = null,
    override var message: String?,
    var description: String? = null,
    var httpStatus: HttpStatus = HttpStatus.BAD_REQUEST,
    throwable: Throwable? = null
) : RuntimeException(message, throwable)
