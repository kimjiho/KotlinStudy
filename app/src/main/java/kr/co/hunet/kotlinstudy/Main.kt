package kr.co.hunet.kotlinstudy

import java.util.Scanner

fun main() {
    /**
     * Max, Min (최대값, 최소값)
     * */
//    var i = 10
//    var j = 20
//    println("Min >> ${min(i, j)}")
//    println("Max >> ${max(i, j)}")


    /**
     * Random 함수
     * 랜덤 값을 반환 한다.
     * until ~까지
     * */

//    val randomNumber = Random.nextInt(0, 1)
//    println("randomNumber: $randomNumber")
//
//    val randomUntil = Random.nextInt(until = 10)
//    println("randomUntil: $randomUntil")


    /**
     * scanner
     * 키보드 입력값 > 예제로 자주 등장하지만, 실제로 자바 응용프로그램이 아니면 거의 사용할 일이 없다고 생각한다. 'ㅅ'
     * */
    //val reader = Scanner(System.`in`)
    //val nxtInt = reader.nextInt()
    //val nx = reader.nextShort()
    //println("next Int: $nxtInt")
    //println("next : $nx")

    /* 점수를 입력 받아 평균 구하기 */
    val emptyList = emptyList<Int>()
    val scoreList = emptyList.toMutableList()
    val reader = Scanner(System.`in`)

    println("점수를 입력 하세요! [다섯번]")

    for (i in 0..4) {
        val nxtInt = reader.nextInt()
        scoreList.add(nxtInt)
    }

    var score = 0
    repeat(scoreList.size) {
        score += scoreList[it]
    }

    println("총 점수는 -> $score")
    println("평균은 -> ${score / 5}")

    /**
     * List
     * 값을 셋팅할 수 없음. 불변 리스트
     * */
//    val items = listOf(1,2,3,4,5)
//
//    for(i in items) {
//        print(i)
//    }
//
//    items.forEach { item ->
//        println(item)
//    }

    /**
     * Mutable List
     * 값을 셋팅할 수 있는. 변할 수 있는 리스트
     * */
//    val mutableItems = mutableListOf(1, 2, 3, 4, 5)
//    mutableItems.forEach { item ->
//        println(item)
//    }
//
//    mutableItems[0] = 2


    /**
     * Null Safety
     * */
    /*
    val name: String? = null
    var name2: String = "1234"

    name?.let {
        name2 = it
    }

    print(sum(a = 10, b = 5))

     */

//    val john = Person(name = "John", age = 20, hobby = "cycle")
//    val john2 = Person(name = "John", age = 20)
//
//    print("name: ${john.name}")
//    print("name: ${john.age}")
//    println(john)
//    println(john2)
//    println(john == john2)
}

fun sum(a: Int, b: Int) = a+b

data class Person(
    val name: String,
    val age: Int
) {
    constructor(name: String, age: Int, hobby: String) : this(name, age)
}