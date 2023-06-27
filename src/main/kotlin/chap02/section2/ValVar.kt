package chap02.section2

/**
 * 변수와 자료형
 * 변수르 선언하려면 선언키워드(val/var)를 사용.
 * val은 상수(변경이 안됨), var은 변수에 사용.
 */

fun main() {
    val number = 10
    var language = "Korean" // ctrl + shift + p 를 누르면 추론된 자료형을 알려줌.
    val secondNumber: Int = 20
    language = "English"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}




