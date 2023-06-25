package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }

    fun access() {
        privateFunc() // 같은 클래스 내에서 호출.
    }
}

class OtherClass {
//    val opc = PrivateClass() 같은 파일이지만 다른 클래스의 프로퍼티로서 private class의 인스턴스를 생성하려면 프로퍼티도 private으로 선언해주어야 함.
    fun test() {
        val pc = PrivateClass() // 다른 클래스에서 생성이 가능한가?
    }
}

fun main() {
    val pc = PrivateClass()
    pc.access()
//    pc.i
//    pc.privateFunc()

    val oc = OtherClass()
    oc.test() // OtherClass의 인스턴스는 생성이 가능하나 내부적으로 PrivateClass의 인스턴스를 생성해야되는데 이게 어떻게 되는거지?
}

fun TopFunction() {
    val tpc = PrivateClass()
}

/**
 * 같은 파일에서는 PrivateClass의 객체를 생성할 수 있습니다.
 * 만일 다른 클래스에서
 * 프로퍼티로서 PrivateClass의 객체를 지정하려면
 * 똑같이 프로퍼티를 private으로 선언해야 합니다.
 * 즉 main()과 TopFunction()에서 PrivateClass 인스턴스를 생성할 수 있었던 것은 같은 파일 내에 있었기 때문.
 * 다만 OtherClass는 다른 클래스이고 클래스 내부에서 프로퍼티로서 인스턴스를 생성하려고 했는데 opc를 private으로 선언해주지 않아 생성하지 못함.
 * OtherClass의 test() 메소드에서 만든 인스턴스는 클래스 프로퍼티가 아니므로 가능했던 것으로 보임.
 */