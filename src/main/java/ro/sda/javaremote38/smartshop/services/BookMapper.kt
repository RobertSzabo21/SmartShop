package ro.sda.javaremote38.smartshop.services

import org.springframework.stereotype.Service
import ro.sda.javaremote39.springseed.dto.BookDto
import ro.sda.javaremote39.springseed.entities.Book


@Service
class BookMapper : Mapper<Book?, BookDto?> {
    fun convertToDto(entity: Book): BookDto {
        val result = BookDto()
        result.setAuthor(entity.getAuthor())
        result.setId(entity.getId())
        result.setTitle(entity.getTitle())
        return result
    }

    fun convertToEntity(dto: BookDto): Book {
        val result = Book()
        result.setAuthor(dto.getAuthor())
        result.setId(dto.getId())
        result.setTitle(dto.getTitle())
        return result
    }
}

