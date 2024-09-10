package kr.co.hunet.kotlinstudy.ch27_collection

fun main() {

    // arrayOf -> Any Type 어떤 타입이든 올 수 있다는 것이 기존 array 와 다른 점이다.
    val colors = arrayOf("red", "green", "blue", 1, 2, 3, 4L, true, 3.14)

    for(c in colors) {
        print("$c \t")
    }

    println()

    colors.forEach {
        print("$it \t")
    }

    colors.forEachIndexed { index, any ->
        println("$index : $any")
    }
}