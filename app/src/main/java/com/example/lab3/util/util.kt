package com.example.lab3.util

fun isPalindrom(str: String): Boolean {
    val str = str.filterNot { sym -> sym == ' ' }.lowercase()
    var ret = true
    for (i in 0..str.length / 2) {
        ret = str[i] == str.reversed()[i]
    }
    return ret
}