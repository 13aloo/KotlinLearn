package loops

import java.util.Date
import kotlin.text.iterator

fun helloWorld() {
    println("Hello World!")
}

fun helloWorldWithSpaces(text: String){
    for (char in text) {
        print(buildString {
            append(char)
            append(" ")
        })
    }
}

fun getCurrentDate(): Date{
    return Date()
}

fun max(a: Int, b: Int): Int {
    return if (a >= b) {
        a
    } else {
        b
    }
}

fun main() {
    println(getCurrentDate())
    helloWorld()
//    loops.helloWorldWithSpaces("Kotlin World")
    max(42,11)
    helloWorldWithSpaces("Ebat tu loh")
}