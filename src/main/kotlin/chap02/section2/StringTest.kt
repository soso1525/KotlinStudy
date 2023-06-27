package chap02.section2


fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}") // 참조값 비교 (===)
    println("str1 == str3: ${str1 == str3}")   // 내용 비교 (==)

    // 코틀린은 힙 영역의 String Pool 공간에 "Hello" 를 저장하고 str1과 str3이 참조해서 사용하도록 함.
    println(str1.hashCode())
    println(str2.hashCode())
    println(str3.hashCode())
}
