package kr.co.hunet.kotlinstudy.ch27_collection

fun main() {
    var numbers = setOf(1, 3, 3, 9)
    println("numbers Count => ${numbers.size}")

    numbers.forEach {
        println(it)
        //중복된 값 제거해주고, 출력한다.
    }
}