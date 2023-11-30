package com.wanchalerm.tua.customer.exception

import com.wanchalerm.tua.customer.constant.ResponseEnum
import org.springframework.http.HttpStatus

class NoContentException (
    var code: String? = ResponseEnum.NO_CONTENT.code,
    override var message: String? = ResponseEnum.NO_CONTENT.message,
    var description: String? = ResponseEnum.NO_CONTENT.description,
    var httpStatus: HttpStatus = HttpStatus.NOT_FOUND,
    throwable: Throwable? = null
) : RuntimeException(message, throwable)