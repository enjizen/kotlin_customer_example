package com.wanchalerm.tua.customer.extension

import java.util.*

fun String.camelToSnake(): String {
    // Regular Expression
    val regex = "([a-z])([A-Z]+)"

    // Replacement string
    val replacement = "$1_$2"

    return this
        .replace(regex.toRegex(), replacement)
        .lowercase(Locale.getDefault())
}
