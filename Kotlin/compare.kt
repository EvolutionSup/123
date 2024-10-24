fun main() {
    println("Сегодня больше?: ${compareTime(300, 250)}")
    println("Сегодня больше?: ${compareTime(300, 300)}")
    println("Сегодня больше?: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}