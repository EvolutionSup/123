class QuestionGenerics<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = QuestionGenerics<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = QuestionGenerics<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = QuestionGenerics<Int>("How many days are there between full moons?", 28, "hard")
}
