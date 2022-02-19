import java.util.*
import kotlin.time.Duration
import kotlin.time.measureTime

fun main() {
    val s = Scanner(System.`in`)
    val N: Int = s.nextInt()

    //{1,2,3,4,5} 리스트 만들어서 foreach 문으로 돌리면 좋지 않을까..?
    //그냥 이중 포문이랑 비교해보기

    // Sol 1) list, foreach 사용
    val duration1: Duration = measureTime {
        val list: List<Int> = (1..N).map { it -> it }.toList()

        list.forEach { i ->
            for (index in 0 until i) {
                print("*")
            }
            println()
        }
    }

    // Sol 2) 2중 for문 사용
    for (line in 0..N) {
        for (count in 0 until line) {
            print("*")
        }
        println()
    }
}