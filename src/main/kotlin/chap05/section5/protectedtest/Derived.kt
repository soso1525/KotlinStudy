package chap05.section5.protectedtest

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }

    fun access() {
        protectedFunc()
    }

    protected class Nested
}

class Derived : Base() {
    fun test(base: Base): Int {
        // protected로 지정된 멤버는 상속된 하위 클래스에서는 자유롭게 접근이 가능하다.
        protectedFunc()
        return i
    }
}

fun main() {
    val base = Base()
    // protected로 지정된 멤버는 외부 클래스나 객체 생성 후 점(.) 표기를 통해 protected 멤버에 접근하는 것은 허용되지 않는다.
    // base.i
    // base.protectedFunc()
    base.access()
}