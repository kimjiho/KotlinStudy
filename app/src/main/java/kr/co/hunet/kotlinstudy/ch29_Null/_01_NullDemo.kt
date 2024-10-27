package kr.co.hunet.kotlinstudy.ch29_Null

fun main() {

    //nullable
    var hello: String? = null
    println("hello > $hello")

    hello = "안녕하세요"
    println("hello > $hello")


    //null check
    var a = null

    // let 키워드로 null 이 아닐 때만 로직 수행
    a?.let {
        print("let >> $it")
    }

    val aValue = a?.toString() ?: 1234
    println(aValue)
}