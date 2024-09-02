package kr.co.hunet.kotlinstudy.ch13_ifElse

fun main() {
    var score = 60

    if(score >= 60) {
        println("합격")
    }else {
        println("불합격")
    }

    var x = 10
    if(x == 10) {
        println("x는 ${x}입니다.")
    }

    x = 9
    if(x != 10) {
        println("x는 ${x}입니다.")
    }
}