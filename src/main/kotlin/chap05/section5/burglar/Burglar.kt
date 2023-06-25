package chap05.section5.burglar

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {
    private var year: Int = _year
    var model: String = _model
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the engine!")
    }

    class Driver(_name: String, _license: String) {
        private var name: String = _name
        var license: String = _license
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean) : Car(_year, _model, _power, _wheel) {
    override var power: String = "50ph"
    val driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean) : this(2014, "basic", "100hp", "normal", _name, _key) {
        name = _name
        key = _key
    }

    fun access(password: String) {
        if (password == "gotico") {
            println("----[Tico] access()----")
            // super.year // private property
            println("super.model = ${super.model}")
            println("super.power = ${super.power}")
            println("super.wheel = ${super.wheel}")

            super.start(key)

            // driver.name // private property
            println("Driver().license = ${driver.license}")
            driver.driving()
        } else {
            println("You're a burglar")
        }
    }
}

class Burglar {
    fun steal(anycar: Any) {
        if (anycar is Tico) { // 이 때 이미 anycar 은 Tico 타입으로 변경되는 건가?
            println("----[Burglar] steal()----")
            // println(anycar.power) // protected
            // println(anycar.year) // private

            println("anycar.name = ${anycar.name}")
            println("anycar.wheel = ${anycar.wheel}")
            println("anyar.model = ${anycar.model}")

            println(anycar.driver.license)
            anycar.driver.driving()
            // println(Car.start()) // protected
            anycar.access("dontknow")
        } else {
            println("Nothing to steal")
        }
    }
}

fun main() {
//    val car =  Car() 빈 생성자는 없으며 그나마 있는 생성자도 protected 로 되어있어 코드처럼 car 인스턴스를 만들 수 없다.
    val tico = Tico("kildong", true) // Instantiate Tico using secondary constructor.
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}