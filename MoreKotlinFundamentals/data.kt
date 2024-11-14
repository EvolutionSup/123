data class QuestionData<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question1 = QuestionData<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = QuestionData<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = QuestionData<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())
}