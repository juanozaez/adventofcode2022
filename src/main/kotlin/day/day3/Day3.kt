package day.day3

/**
 * Rucksack Reorganization
 * https://adventofcode.com/2022/day/3
 */
object Day3 {
    fun score1(input: String): Int =
        input.trim()
            .split("\n")
            .sumOf { it.calculatePriority() }

    private fun String.calculatePriority(): Int =
        commonChar(
            substring(0, (length / 2)),
            substring((length / 2))
        ).priority()

    private fun commonChar(a: String, b: String): Char = a.first { it in b }

    private fun Char.priority(): Int =
        scoreMap.getOrDefault(this, scoreMap.getValue(this.lowercaseChar()) + 26)

    private val scoreMap = mapOf(
        'a' to 1,
        'b' to 2,
        'c' to 3,
        'd' to 4,
        'e' to 5,
        'f' to 6,
        'g' to 7,
        'h' to 8,
        'i' to 9,
        'j' to 10,
        'k' to 11,
        'l' to 12,
        'm' to 13,
        'n' to 14,
        'o' to 15,
        'p' to 16,
        'q' to 17,
        'r' to 18,
        's' to 19,
        't' to 20,
        'u' to 21,
        'v' to 22,
        'w' to 23,
        'x' to 24,
        'y' to 25,
        'z' to 26
    )
}