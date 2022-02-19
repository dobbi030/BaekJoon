import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()

    for (line in 0 until N) {
        repeat(N - line) { print("*") }
        println()
    }
}