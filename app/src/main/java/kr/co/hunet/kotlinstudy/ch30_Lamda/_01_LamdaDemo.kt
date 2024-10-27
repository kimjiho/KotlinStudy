package kr.co.hunet.kotlinstudy.ch30_Lamda

import android.annotation.SuppressLint

@SuppressLint("DefaultLocale")
fun main() {

    val numbers = arrayOf(1,2,3,4,5)

    //extension method
    /*
    sum
    count
    average
    max
    min

     */

    val average = numbers.average()
    println("number average : ${String.format("%.2f", average)}")


    //Filter
    val newNumber = numbers.filter {
        it > 3
    }
    println("newNumber : $newNumber")

    val newNumber2 = numbers.filter {
        it % 2 == 0
    }
    println("newNumber2 : $newNumber2")

    println("----")

    //Sort Array
    val desc = numbers.sortedArrayDescending()
    desc.forEach {
        println(it)
    }
}