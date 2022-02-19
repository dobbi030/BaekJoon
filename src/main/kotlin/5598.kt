import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val cryptogram: String = scanner.nextLine()

    /*
    *A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    *D E F G H I J K L M N O P Q R S T U V W X Y Z A B C
    **/
    val alphabet: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    //joinToString: list 의 원소들을 이은 문자열을 반환
    val origin: List<Char> = cryptogram.map { item -> alphabet[(alphabet.indexOf(item) + 23) % 26] }.toList()
    println(origin.joinToString(""))
}