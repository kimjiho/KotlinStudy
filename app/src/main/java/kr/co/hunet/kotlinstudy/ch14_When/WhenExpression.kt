package kr.co.hunet.kotlinstudy.ch14_When

fun main() {
    var x = 2

    when(x) {
        1 -> {
            println("1 입니다.")
        }
        2 -> {
            println("2 입니다.")
        }
        else -> { println("1과 2가 아닙니다.") }
    }
}