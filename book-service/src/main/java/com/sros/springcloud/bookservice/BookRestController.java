package com.sros.springcloud.bookservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookRestController {

    @Value("${book.id}")
    private String bookId;
    @Value("${book.title}")
    private String bookTitle;
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.genre}")
    private String bookGenre;

    @GetMapping
    public Book getBook(){
        return new Book(bookId, bookTitle, bookGenre, bookAuthor);
    }
}
