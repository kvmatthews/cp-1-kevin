package com.kvsuma.kotlin


fun main(args: Array<String>) {

    val arr = listOf(
        mapOf(
            "number" to 4
        ),
        mapOf(
            "number" to 2
        ),
        mapOf(
            "number" to 2,
            "char" to "A"
        ),
        mapOf(
            "number" to 1,
            "char" to "B"
        ),
        mapOf(
            "number" to 5
        ),
        mapOf(
            "number" to 1,
            "char" to "A"
        ),
        mapOf(
            "number" to 5,
            "char" to "B"
        ),
        mapOf(
            "number" to 3,
            "char" to "D"
        ),
        mapOf(
            "number" to 4,
            "char" to "E"
        ),
        mapOf(
            "number" to 2,
            "char" to "C"
        ),
        mapOf(
            "number" to 1
        )
    )

    val sortedArr = arr.sortedBy { it["number"] as Int }
    println(sortedArr)

}