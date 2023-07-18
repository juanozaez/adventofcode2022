package day.day2

/**
 * Rock Paper Scissors
 * https://adventofcode.com/2022/day/2
 */
object Day2 {

    fun score1(input: String): Int =
        input.trim()
            .split("\n")
            .sumOf { scores1[it] ?: 0 }

    fun score2(input: String): Int =
        input.trim()
            .split("\n")
            .sumOf { scores2[it] ?: 0 }


    private val scores1: Map<String, Int> =
        mapOf(
            "A X" to 1 + 3,
            "A Y" to 2 + 6,
            "A Z" to 3 + 0,
            "B X" to 1 + 0,
            "B Y" to 2 + 3,
            "B Z" to 3 + 6,
            "C X" to 1 + 6,
            "C Y" to 2 + 0,
            "C Z" to 3 + 3,
        )

    private val scores2: Map<String, Int> =
        mapOf(
            "A X" to 3 + 0,
            "A Y" to 1 + 3,
            "A Z" to 2 + 6,
            "B X" to 1 + 0,
            "B Y" to 2 + 3,
            "B Z" to 3 + 6,
            "C X" to 2 + 0,
            "C Y" to 3 + 3,
            "C Z" to 1 + 6,
        )
}