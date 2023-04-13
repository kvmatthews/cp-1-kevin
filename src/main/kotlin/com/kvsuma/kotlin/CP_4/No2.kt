package com.kvsuma.kotlin.CP_4

import java.util.*

fun getNumBits(n: Int): Int {
    var count = 0
    var num = n
    while (num != 0) {
        count += num and 1
        num = num shr 1
    }
    return count
}

fun main() {
    print("Input berapa banyak angka yang akan dimasukan : ")
    val scanner = Scanner(System.`in`)
    val T = scanner.nextInt()
    repeat(T) {
        val n = scanner.nextInt()
        val asDec = getNumBits(n)
        var asHex = 0
        var num = n
        while (num != 0) {
            asHex += getNumBits(num % 10)
            num /= 10
        }
        println("$asDec $asHex")
    }
}