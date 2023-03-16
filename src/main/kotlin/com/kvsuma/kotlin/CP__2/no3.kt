package com.kvsuma.kotlin.CP__2

fun main() {
    val sentenceWithDoubleQuotes = "\"to be or not to be,\" quoth the bard, \"that is the question\". the programming contestant replied: \"I must disagree. to 'C' or not to 'C', that is The Question\""
    val sentenceWithSingleQuotes = sentenceWithDoubleQuotes.replace("\"", "''")
    println(sentenceWithSingleQuotes)
}