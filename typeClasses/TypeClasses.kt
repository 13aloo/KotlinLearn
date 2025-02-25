package typeClasses

class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean){

    fun borrowed(){
        if(!borrowed){
            borrowed = true
//            return true
        } else{
            println("The book is not available")
//            return false
        }
    }

    fun returnBook(){
        if (borrowed){
            borrowed = false
//            return false
        } else{
            println("The book is not borrowed, so it can not be returned")
//            return true
        }
    }

    fun print(){
        println("Book [Title: $title, author: $author, Year: $publicationYear]")
    }
}

fun main(){
    val book = Book("Lord of the rings", "John Rolling", 1979, true)

    book.borrowed()
    book.returnBook()
    book.print()
}