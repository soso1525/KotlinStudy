package chap05.section6.aggregation

/**
 * 집합 관계는 연관 관계와 거의 동일하지만 특정 객체를 소유한다는 개념이 추가된 것입니다.
 */

class Pond(_name: String, _members: MutableList<Duck>) {
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String) : this(_name, mutableListOf())
}

class Duck(val name: String)

fun main() {
    val pond = Pond("myFavorite")
    val duck1 = Duck("Duck1")
    val duck2 = Duck("Duck2")

    pond.members.add(duck1)
    pond.members.add(duck2)

    for (duck in pond.members)
        println(duck.name)
}

