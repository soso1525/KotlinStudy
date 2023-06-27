package chap01.section2

// 인자를 넣어서 프로그램을 실행시키려면 Edit Configurations > Program arguments에 인자를 공백으로 구분하여 입력한다.
fun main(args: Array<String>) {
    println(args.size)

    for (arg in args) {
        println(arg)
    }
}