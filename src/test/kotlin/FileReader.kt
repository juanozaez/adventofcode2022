import java.io.BufferedReader
import java.io.InputStreamReader

object FileReader {

    fun read(fileName: String): String {
        val inputStream = this::class.java.getResourceAsStream(fileName)
        val reader = BufferedReader(InputStreamReader(inputStream!!))
        return reader.readText().also { reader.close() }
    }
}