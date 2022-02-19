import java.util.*

fun main() {
    val scanner:Scanner = Scanner(System.`in`)
    val N:Int = scanner.nextInt()

    var result: Int = 1

    for (i in 1..N) {
        result *= i
    }

    println(result)
}