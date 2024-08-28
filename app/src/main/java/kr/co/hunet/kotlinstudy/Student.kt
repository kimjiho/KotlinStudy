package kr.co.hunet.kotlinstudy

data class Student(
    val names: String,
    val ages: Int,
    val major: String
) : Person(names, ages) {

    override fun print() {
        println("안녕하세요. 이름은 $names, 나이는 $ages, 전공은 $major 입니다.")
    }
}
