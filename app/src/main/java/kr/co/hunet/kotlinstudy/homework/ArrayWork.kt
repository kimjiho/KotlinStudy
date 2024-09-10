package kr.co.hunet.kotlinstudy.homework

fun main() {

    //1. 숫자를 무작위로 5개 입력 받기 -> array로 관리 (list x)
    //2. 그 숫자들이 홀수인지, 짝수인지 출력하기
    //3. 짝수인 경우에는 그 숫자의 절반까지 카운트 하기
    //
    //array, when 사용하기

    println("아무 숫자나 5개 입력하세요.")

    //val intArray = intArrayOf(5,4,3,2,1)
    val intArray = Array(5) { 0 }
    var count = 0
    /* while */
//    while (count < 5) {
//        var readValue = readln()
//
//        if(readValue.isEmpty()) {
//           readValue = readln()
//        }
//
//        intArray[count] = readValue.run { toInt() }
//
//        count++
//    }

    /* do~while */
    do {
        val readValue = readln()

        if(readValue.isEmpty()) {
            continue
        }

        intArray[count] = readValue.run { toInt() }

        count++
    }while (count < 5)

    for(item in intArray) {
        /*
        when(item % 2) {    // 짝수 구분
            0 -> {
                println("$item -> 짝수입니다.")

                // 2로 나눈후, 출력
                val divide: Int = item / 2
                if(divide > 1) {
                    for(i in divide downTo 1) {
                        print("$i  ")
                    }
                    println()
                }
            }

            else -> println("$item -> 홀수입니다.")
        }

         */

        //if~
        if(item % 2 == 0) {
            println("$item -> 짝수입니다.")

            // 2로 나눈후, 출력
            val divide: Int = item / 2
            for(i in divide downTo 1) {
                print("$i  ")
            }
            println()
        }else {
            println("$item -> 홀수입니다.")
        }

    }
}