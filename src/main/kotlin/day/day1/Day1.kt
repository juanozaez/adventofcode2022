package day.day1

/**
 * Calorie counting
 * https://adventofcode.com/2022/day/1
 */
object Day1 {

    fun max(input: String): Int =
        input
            .trim()
            .split("\n\n")
            .map { it.lines().sumOf {line -> line.toInt()} }
            .maxOf { it }

    fun max3(input: String): Int=
        input
            .trim()
            .split("\n\n")
            .map { it.lines().sumOf {line -> line.toInt()} }
            .sortedByDescending {it}
            .take(3)
            .sum()
}