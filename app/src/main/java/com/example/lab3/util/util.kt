package com.example.lab3.util

fun preprocessStr(str: String) = str.filter { sym -> sym.isLetter() }.lowercase()

fun isPalindrom(str: String): Boolean {
    var ret = true
    for (i in 0..<str.length / 2) {
        if (str[i] != str.reversed()[i]) {
            ret = false
            break
        }
    }
    return ret
}