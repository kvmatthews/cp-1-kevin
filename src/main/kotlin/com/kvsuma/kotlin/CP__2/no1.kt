package com.kvsuma.kotlin.CP__2

fun main() {
    val arr = arrayOf(2, 1, 5, 3, 5)
    var total1 = 0
    var total2 = 0

    for (i in arr[1]..arr[2]) {
        if (i % 2 != 0) {
            total1 += i
        }
    }
    for (i in arr[3]..arr[4]) {
        if (i % 2 != 0) {
            total2 += i
        }
    }

    println("Case 1 : $total1")
    println("Case 2 : $total2")
}