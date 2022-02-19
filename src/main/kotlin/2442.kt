import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()

    // 뒤쪽의 공백은 출력 필요X
    for (line in 0 until N) {
        repeat(N - line - 1) { print(" ") }
        repeat(2 * line + 1) { print("*") }
//        repeat(N - line - 1) { print(" ") }
        println()
    }
}