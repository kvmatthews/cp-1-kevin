package com.kvsuma.kotlin.CP__2

//fun main() {
//    println("masukan angka: ")
//    val n = readLine()?.toInt() ?: 0
//    val m = readLine()?.toInt() ?: 0
//    var num = n
//    var seq = mutableListOf<Int>()
//
//    while (num > 1) {
//        seq.add(num)
//        if (num % m == 0) {
//            num = num / m
//        } else {
//            println("boring!")
//            break
//        }
//    }
//    if (num == 1) {
//        seq.add(num)
//        println(seq.joinToString(", "))
//    }
//}

fun main() {
    print("masukan angka: ")
    val n = readLine()?.toInt() ?: 0
    print("dibagi: ")
    val m = readLine()?.toInt() ?: 0
    var num = n
    var seq = mutableListOf<Int>()

    while (num > 1) {
        seq.add(num)
        if (num % m == 0) {
            num = num / m
        } else {
            println("boring!")
            break
        }
    }
    if (num == 1) {
        seq.add(num)
        println(seq.joinToString(", "))
    }
}