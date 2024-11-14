enum class Difficulty {
    EASY, MEDIUM, HARD
}

class QuestionEnum<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

val question1 = QuestionEnum<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
val question2 = QuestionEnum<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
val question3 = QuestionEnum<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
