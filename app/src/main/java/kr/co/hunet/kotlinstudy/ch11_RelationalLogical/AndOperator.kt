package kr.co.hunet.kotlinstudy.ch11_RelationalLogical

//&& 둘 다 참일 때만 '참'
//|| 둘 중 하나만 참이어도 '참'

fun main() {
    println(true && true)   //true
    println(true && false)  //false
    println(true || true)   //true
    println(true || false)  //true
    println(false || false) //false
}