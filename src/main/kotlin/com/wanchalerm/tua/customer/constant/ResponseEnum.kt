package com.wanchalerm.tua.customer.constant

enum class ResponseEnum(val code: String, val message: String, val description: String) {
    SUCCESS("200", ResponseStatusConstant.SUCCESS, ResponseStatusConstant.SUCCESS),
    BAD_REQUEST("400", ResponseStatusConstant.BAD_REQUEST, ResponseStatusConstant.BAD_REQUEST),
    DATA_NOT_FOUND("404", ResponseStatusConstant.DATA_NOT_FOUND, ResponseStatusConstant.DATA_NOT_FOUND),
    UNKNOWN("400", ResponseStatusConstant.BAD_REQUEST, ResponseStatusConstant.BAD_REQUEST),
    UNAUTHORIZED("401", ResponseStatusConstant.UNAUTHORIZED, ResponseStatusConstant.UNAUTHORIZED);

    companion object {
        fun getByCode(code: String?): ResponseEnum {

           for (responseEnum in values()) {
                if (responseEnum.code == code) {
                    return responseEnum
                }
            }
            return UNKNOWN
        }
    }
}
