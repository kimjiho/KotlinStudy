package kr.co.hunet.kotlinstudy.ch12_BitOperator

fun main() {
    var number = 2 // 0b_0000_0010

    println(number shl 1) // 왼쪽으로 한칸 이동 0100 == 4

    println(number shr 1) // 오른쪽으로 한칸 이동 0001 == 1
}