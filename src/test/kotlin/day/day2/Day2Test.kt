package day.day2

import FileReader
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Day2Test {

    @Test
    fun `returns the score 1 of playing rock, paper and scissors`() {
        Day2.score1(FileReader.read("/day/day2/input1.txt")) shouldBe 15
    }

    @Test
    fun `returns the score 2 of playing rock, paper and scissors`() {
        Day2.score2(FileReader.read("/day/day2/input1.txt")) shouldBe 12
    }
}