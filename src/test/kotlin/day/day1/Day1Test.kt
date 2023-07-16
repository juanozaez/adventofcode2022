package day.day1

import FileReader
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day1Test {

    @Test
    fun `returns the sum of the calories of the elf with max calories`() {
        Day1.max(FileReader.read("/day/day1/input1.txt")) shouldBe 24000
        Day1.max(FileReader.read("/day/day1/input2.txt")) shouldBe 11000
    }

    @Test
    fun `returns the sum of the calories of the 3 elves with max calories`() {
        Day1.max3(FileReader.read("/day/day1/input1.txt")) shouldBe 45000
    }
}