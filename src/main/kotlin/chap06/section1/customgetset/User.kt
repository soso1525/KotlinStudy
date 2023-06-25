package chap06.section1.customgetset

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) { // set 앞에 접근 제한 지시자를 붙이면 외부에서 값을 임의로 변경하는 것을 막을 수 있다.
            println("The name was changed")
            field = value.uppercase()
        }

    var age:Int = _age
}

fun main() {
    val user = User(1, "kildong", 35)
    user.name = "coco"
    println("user.name = ${user.name}")
}