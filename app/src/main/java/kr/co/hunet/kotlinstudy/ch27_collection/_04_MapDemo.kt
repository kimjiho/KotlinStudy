package kr.co.hunet.kotlinstudy.ch27_collection

fun main() {
    val map = mapOf(1 to "하나", 2 to "둘", 3 to "셋")

    val mutableMap = mutableMapOf(1 to "하나", 2 to "둘", 3 to "셋")
    mutableMap[3] = "셋셋셋"

    mutableMap.forEach { (i, s) ->
        println("$i : $s")
    }
}