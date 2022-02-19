import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    val N: Int = s.nextLine().toInt()

    // Sol 1)
    for (line in 1..N) {
        for (blank in 0 until N - line) {
            print(" ")
        }
        for (count in 0 until line) {
            print("*")
        }
        println()
    }

    // Sol 2)
    for (line in 1..N) {
        repeat(N - line) { print(" ") }
        repeat(line) { print("*") }
        println()
    }
}