package chap02.section1

import chap02.section1.com.example.edu.Person as User // 패키지에 포함된 클래스에 별명을 붙여서 사용할 수 있음.
import kotlin.math.PI
import kotlin.math.abs

/**
 * 코틀린 패키지
 * 파일 < 패키지 < 모듈 < 프로젝트
 */

fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println("intro: $intro, num: $num")

    // import kotlin.math
    println(PI)
    println(abs(-12.6))

    // 패키지에 별명을 붙이면 더 이상 com.example.edu.Person 클래스는 사용이 불가능하며 User 타입으로 사용해야 한다.
    // 아래 user2 타입은 이 파일 내에서 선언한 Person을 의미한다.
    val user1 = User("Kildong", 30)
    println(user1.name)
    println(user1.age)

    val user2 = Person("A123", "Kildong")
    println(user2.id)
    println(user2.name)
}

class Person (val id: String, val name: String)



