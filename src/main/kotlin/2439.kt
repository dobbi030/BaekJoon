import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    val N: Int = s.nextLine().toInt()

    for (line in 1..N) {
        for (count in 0 until line) {
            print("*")
        }
        println()
    }
}