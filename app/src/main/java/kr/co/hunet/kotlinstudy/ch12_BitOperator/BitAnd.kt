package kr.co.hunet.kotlinstudy.ch12_BitOperator

fun main() {
    var x: Int = 0b1010 // 2진수 1010, 10진수 10
    var y: Int = 0b1100 // 10진수 12

    println(x)
    println(y)

    var z: Int = x and y // 둘다 1 이어야 1
    println(z)

    //1000 = 8
}