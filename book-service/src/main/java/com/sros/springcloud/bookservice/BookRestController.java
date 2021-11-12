package com.sros.springcloud.bookservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("books")
public class BookRestController {

    private static final List<Book> books;

    static {
        books = new ArrayList<>();
        books.add(new Book(1, "Spring Cloud Gateway", "Spring Cloud", "Jing Hub"));
        books.add(new Book(2, "Spring Cloud OpenFeign", "Spring Cloud", "Jing Hub"));
        books.add(new Book(3, "Spring Cloud Config", "Spring Cloud", "Jing Hub"));
    }

    @GetMapping
    public List<Book> getAll() {
        return books;
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {
        return books.get(id);
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        books.add(book);
        return book;
    }

}
