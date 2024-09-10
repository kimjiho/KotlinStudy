package kr.co.hunet.kotlinstudy.ch13_ifElse

import kotlin.math.max

fun main() {
    println("첫번째 수: ")
    var first = (readlnOrNull() ?: "").toIntOrNull() ?: 0

    println("두번째 수: ")
    var second = (readlnOrNull() ?: "").toIntOrNull() ?: 0

    if(first >= second) {
        println("큰 값은 첫번째 수 $first 입니다.")
    }else {
        println("큰 값은 두번째 수 $second 입니다.")
    }

    val maxValue = max(first, second)
    println("큰 값은 $maxValue 입니다.")
}