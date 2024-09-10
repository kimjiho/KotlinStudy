package kr.co.hunet.kotlinstudy.ch14_When

fun main() {
    var first = 3
    var second = 5

    val max = if(first > second) first else second
    println("MAX: $max")

}