package kr.co.hunet.kotlinstudy


fun main() {

    /* Syntax_출력문_주석문_이스케이프 시퀀스 등 기본 문법 사용하기 */

    //Escape character
    /*
    \n 줄바꿈, 개행
    \t 탭
    \b 백스페이스
    \r 맨 앞 커서 이동
    \\ 역슬래시 문자 출력
    \' 작은 따옴표
    \" 큰 따옴표
     */
    println("abcd \"\'\\ \b \r\nhello")

    //RAW 문자열
    //시작과 끝에 큰 따옴표 3개를 이용해 raw 문자열을 사용할 수 있다.

    val name = "Eve"
    val memo = """Dear $name, a quick reminder about the
~party we have scheduled next Tuesday at
~the 'Low Cermony Cafe' at Noon. | Please plan to..."""

    //trimMargin -> 구분자를 이용하여 멀티라인을 표현할 수 있다.
    println(memo.trimMargin("~"))


    /* Variable_변수 만들기_변수와 상수 그리고 리터럴 */

    // 리터럴: 변수에 대입한 값 자체를 '리터럴' 이라고 한다.

    //상수
    val MAX: Int = 100
    //MAX = 200 // 에러
    println(MAX)

    println(1234)       //정수 리터럴
    println(3.14F)      //실수 리터럴
    println(3.14)       //실수 리터럴
    println('A')        //문자 리터럴
    println("HELLO")    //문자열 리터럴

    /* Number_숫자 데이터 형식 사용하기 */
    //Int, Long, Float, Double, Decimal, Byte, Short

    val min: Int = -2147483648  // 정수형이 가질 수 있는 가장 작은 값
    val max: Int = +2147483647  // 정수형이 가질 수 없는 가장 작은 값
    println("min Int: $min")
    println("max Int: $max")

    val i: Int = 1_000
    val b: Byte = 127
    val s: Short = 1234
    val l: Long = 1234L
    val f: Float = 3.14F
    val d: Double = 3.14
    val intValue = d.toInt()

    /* BooleanCharString_숫자 이외의 데이터 형식 사용하기 */

    /* ReadLine_사용자로부터 얻은 정보를 변수에 저장하기 */

    var index = 0
    while(index < 3) {
        println("===> 문자열을 입력하세요.")

        val input = readln().toCharArray()
        println(input.contentToString())

        if (input.isNotEmpty()) {
            try {
                println(input[3])
            } catch (e: Exception) {
                e.printStackTrace()
                println("Not support array Index")
            } finally {
                index++
            }
        }
    }
}