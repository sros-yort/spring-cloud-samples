package com.sros.springcloud.bookstoreservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("book-service")
public interface BookFeignClient {

    @GetMapping(value = "/books")
    List<Book> getBooks();

    @GetMapping(value = "/books/{id}")
    Book getBook(@PathVariable Integer id);

}
