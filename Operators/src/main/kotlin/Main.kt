fun main() {
    var x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result = result + 2
    println("result = $result")

    result = result - 2
    println("result = $result")

    result = result * 2
    println("result = $result")

    result = result / 2
    println("result = $result")

    result = result % 2
    println("result = $result")
}