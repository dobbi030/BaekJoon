import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    var list = mutableListOf<Int>()
    var biggest: Int = 0

    repeat(9) {
        list.add(scanner.nextLine().toInt())
    }

    list.forEach { item ->
        if (item > biggest) biggest = item
    }

    println(biggest)
    println(list.indexOf(biggest) + 1)
}