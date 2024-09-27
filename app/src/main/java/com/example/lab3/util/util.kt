package com.example.lab3.util

fun isPalindrom(str: String): Boolean {
    val prepStr = str.filter { sym -> sym.isLetter() }.lowercase()
    var ret = true
    for (i in 0..<prepStr.length / 2) {
        if (prepStr[i] != prepStr.reversed()[i]) {
            ret = false
            break
        }
    }
    return ret
}