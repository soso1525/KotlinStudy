package chap05.section4.prisecon

class Person(
    firstName: String,
    out: Unit = println("[Primary Constructor] Parameter")
) {

    val fName = println("[Property] Person fName: $firstName")

    init {
        println("[init] Person init block")
    }

    constructor(
        firstName: String,
        age: Int,
        out: Unit = println("[Secondary Constructor] Parameter")
    ) : this(firstName) {
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}

fun main() {
    val p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")


    // [Secondary Constructor] Parameter
    // [Primary Constructor] Parameter
    // [Property] Person fName: Kildong
    // [init] Person init block
    // [Secondary Constructor] Body: Kildong, 30
    //
    // [Primary Constructor] Parameter
    // [Property] Person fName: Dooly
    // [init] Person init block

    // 주생성자 -> init 블럭 (여러 개인 경우 선언한 순서대로) -> 부생서자
}

