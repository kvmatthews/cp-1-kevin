/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.kvsuma.kotlin.CP_1

fun isPrime(n: Int, x: Int = 2): Boolean {
        if (n <= 2){
            return n == 2
        }else if (n % x == 0){
            return false
        }
        else if (x * x > n){
            return true
        }
        return isPrime(n, x + 1)
}

fun main(args: Array<String>) {

    for (x in 1..100) {
        if (isPrime(x)) {
            println("$x: Prime Number")
        }else{
            println("$x: Not Prime Number")
        }
    }


}