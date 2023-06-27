package chap01.section1

fun main() {
    println("Hello Kotlin!")
}

// 코트린 코드는 JVM에서 실행되며, main() 함수가 있는 파일 이름을 기준으로 자바 클래스가 생성된다.
// 생성된 클래스를 보려면 Tools > Kotlin > Show Kotlin Bytecode

//    @Metadata(
//        mv = {1, 8, 0},
//        k = 2,
//        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
//        d2 = {"main", "", "KotlinStudy"}
//    )
//    public final class HelloKotlinKt {
//        public static final void main() {
//            String var0 = "Hello Kotlin!";
//            System.out.println(var0);
//        }
//
//        // $FF: synthetic method
//        public static void main(String[] var0) {
//            main();
//        }
//    }
