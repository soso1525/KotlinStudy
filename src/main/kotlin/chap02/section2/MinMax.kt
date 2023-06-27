package chap02.section2

/**
 * 코틀린은 참조형 자료형만 사용한다. (객체를 생성하여 데이터를 저장)
 * 참조형으로 선언한 변수는 성능 최적화를 위해 컴파일러가 기본형으로 대체한다.
 * 정수 자료형: Byte(1), Short(2), Int(4), Long(8) (숫자는 기본적으로 Int형으로 추론)
 * 실수 자료형: Float(4), Double(8) (실수는 기본적으로 Double형으로 추론)
 *
 * 부동소수점 IEEE 754 표준
 * Float  = 부호(1bit) + 지수(8bit)  + 가수(23bit) = 32bit
 * Double = 부호(1bit) + 지수(11bit) + 가수(52bit) = 64bit
 * 위의 범위를 넘어서면 오차가 발생함.
 */

fun main() {
    var num: Double = 0.1

    for (x in 0..999) // 0 이상 999 이하
        num += 0.1

    // 기대한 값은 100
    // 실제 출력된 값은 100.09999999999859
    println(num)

    println("Byte min: ${Byte.MIN_VALUE}, max: ${Byte.MAX_VALUE}")
    println("Short min: ${Short.MIN_VALUE}, max: ${Short.MAX_VALUE}")
    println("Int min: ${Int.MIN_VALUE}, max: ${Int.MAX_VALUE}")
    println("Long min: ${Long.MIN_VALUE}, max: ${Long.MAX_VALUE}")
    println("Float min: ${Float.MIN_VALUE}, max: ${Float.MAX_VALUE}")
    println("Double min: ${Double.MIN_VALUE}, max: ${Double.MAX_VALUE}")
}