package chap05.section6.composition

/**
 * 구성 관계는 집합 관계와 거의 동일하지만 특정 객체가 어느 한 객체의 부분이 되는 것입니다.
 * 구성품으로 지정된 객체는 생명주기가 소유자 객체에 의존되어 있습니다.
 * 만일 소유자 객체가 삭제되면 구성하고 있던 객체도 같이 삭제됩니다.
 */

class Car(val name: String, val power: String) {
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() =  engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}