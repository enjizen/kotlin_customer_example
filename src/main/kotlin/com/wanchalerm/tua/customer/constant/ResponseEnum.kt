package com.wanchalerm.tua.customer.constant

enum class ResponseEnum(val code: String, val message: String, val description: String) {
    SUCCESS("200", ResponseStatusConstant.SUCCESS, ResponseStatusConstant.SUCCESS),
    BAD_REQUEST("400", ResponseStatusConstant.BAD_REQUEST, ResponseStatusConstant.BAD_REQUEST),
    NO_CONTENT("204", ResponseStatusConstant.NO_CONTENT, ResponseStatusConstant.NO_CONTENT),
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
