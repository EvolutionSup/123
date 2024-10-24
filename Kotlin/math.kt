fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = sub(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(one: Int, two: Int): Int {
    return one + two
}
fun sub(one: Int, two: Int): Int {
    return one - two
}