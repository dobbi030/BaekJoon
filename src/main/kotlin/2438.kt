import java.util.*
import kotlin.system.measureNanoTime

fun main() {
    val s = Scanner(System.`in`)
    val N: Int = s.nextLine().toInt()

    //{1,2,3,4,5} 리스트 만들어서 foreach 문으로 돌리면 좋지 않을까..?
    //그냥 이중 포문이랑 비교해보기

    // Sol 1) list, foreach 사용
    val foreach: Long = measureNanoTime {
        val list: List<Int> = (1..N).map { it -> it }.toList()

        list.forEach { i ->
            for (index in 0 until i) {
                print("*")
            }
            println()
        }
    }

    // Sol 2) 2중 for문 사용
    val doubleFor: Long = measureNanoTime {
        // line 범위 주의하기 (1 <= line <= N)
        for (line in 1..N) {
            for (count in 0 until line) {
                print("*")
            }
            println()
        }
    }

    println("foreach 걸린 시간:\t$foreach")
    println("for 걸린 시간:\t\t$doubleFor")
    /*
    * [결과]
    * N의 값으로 10, 100, 1000, 10000을 시도해본 결과 대략 1만까지는 2중 for문을 사용하는 것이 더 적은 시간이 걸린다.
    * */
}