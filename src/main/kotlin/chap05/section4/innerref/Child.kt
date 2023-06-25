package chap05.section4.innerref

open class Base {
    // 하위클래스에서 오버라이딩을 통해 필드나 메서드를 변경하려면 선언 앞에 open 키워드를 붙여준다.
    // val 상수 변수도 override를 통해 값을 변경할 수 있다.
    open val x: Int = 1
    open fun f() = println("Base Class f()")

    val y: Int = 10
}

class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f()
            Child().f()
            super@Child.f()
            println("[Inside] super@.x: ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}