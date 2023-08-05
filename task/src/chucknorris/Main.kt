package chucknorris

fun main() {
    println("Input string:")
    val x = readln()
    println("The result:")
    for (i in x) {
        println("$i = ${i.code.toString(2).padStart(7, '0')}")
    }
}
