package com.wanchalerm.tua.customer.exception

import com.wanchalerm.tua.customer.constant.ResponseEnum
import org.springframework.http.HttpStatus

class DataNotFoundException (
    var code: String? = ResponseEnum.DATA_NOT_FOUND.code,
    override var message: String? = ResponseEnum.DATA_NOT_FOUND.message,
    var description: String? = ResponseEnum.DATA_NOT_FOUND.description,
    var httpStatus: HttpStatus = HttpStatus.NOT_FOUND,
    throwable: Throwable? = null
) : RuntimeException(message, throwable)