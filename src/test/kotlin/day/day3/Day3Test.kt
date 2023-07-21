package day.day3

import FileReader
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Day3Test {

    @Test
    fun `returns the score 1 of playing rock, paper and scissors`() {
        Day3.score1(FileReader.read("/day/day3/input1.txt")) shouldBe 16
    }

    @Test
    fun `returns the score 2 of playing rock, paper and scissors`() {
        Day3.score1(FileReader.read("/day/day3/input2.txt")) shouldBe 157
    }

}