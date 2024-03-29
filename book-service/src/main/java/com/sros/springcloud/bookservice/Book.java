package com.sros.springcloud.bookservice;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book {
    @NonNull
    private Integer id;
    @NonNull
    private String title;
    @NonNull
    private String genre;
    @NonNull
    private String author;
}
