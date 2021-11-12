package com.sros.springcloud.bookstoreservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book-stores")
@RequiredArgsConstructor
public class BookStoreRestController {

    private final BookFeignClient bookFeignClient;

    @GetMapping
    public String welcome() {
        return "<h1>Welcome from book store service!</h1>";
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookFeignClient.getBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return bookFeignClient.getBook(id);
    }

}
