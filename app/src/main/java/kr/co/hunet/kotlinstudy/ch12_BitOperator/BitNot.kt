package kr.co.hunet.kotlinstudy.ch12_BitOperator

fun main() {
    var x: Int = 0b1010 // 2진수 1010, 10진수 10

    println(x)

    var z: Int = x.inv() // 0000_1010 -> 1111_0101
    println(z)
}