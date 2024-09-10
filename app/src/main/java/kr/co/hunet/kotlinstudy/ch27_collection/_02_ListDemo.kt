package kr.co.hunet.kotlinstudy.ch27_collection

fun main() {

    //list 선언
    val techs = listOf("Kotlin", "Android", "Java", "C#")

    // 1번지~2번지 까지 subList
    val subs = techs.subList(1, 3)
    subs.forEach {
        println(it)
    }

    //mutable list 선언
    val sites = mutableListOf("VisualAcademy", "DotNetKorea")
    sites[1] = "닷넷코리아"  // mutable 이므로, 값을 변경 할 수 있다.
    sites.forEach {
        println(it)
    }
}