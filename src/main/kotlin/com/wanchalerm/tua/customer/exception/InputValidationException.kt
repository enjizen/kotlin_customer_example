package com.wanchalerm.tua.customer.exception

import com.wanchalerm.tua.customer.constant.ResponseEnum
import org.springframework.http.HttpStatus

class InputValidationException(
    var code: String? = ResponseEnum.BAD_REQUEST.code,
    override var message: String? = ResponseEnum.BAD_REQUEST.message,
    var description: String? = ResponseEnum.BAD_REQUEST.description,
    var httpStatus: HttpStatus = HttpStatus.BAD_REQUEST,
    throwable: Throwable? = null
) : RuntimeException(message, throwable)
