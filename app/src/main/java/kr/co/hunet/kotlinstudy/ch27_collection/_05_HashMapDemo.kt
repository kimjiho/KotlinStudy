package kr.co.hunet.kotlinstudy.ch27_collection

fun main() {
    val people = HashMap<Int, String>()
    people[1] = "홍길동"
    people[2] = "백두산"
    people[3] = "임꺽정"

    for ((key, value) in people) {
        println("$key : $value")
    }
}