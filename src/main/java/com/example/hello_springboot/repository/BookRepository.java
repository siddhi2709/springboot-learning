package com.example.hello_springboot.repository;

import com.example.hello_springboot.model.Book;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepository {

    public List<Book> findAll() {
        return Arrays.asList(
                new Book("1", "Spring Boot in Action", "Craig Walls"),
                new Book("2", "Effective Java", "Joshua Bloch"),
                new Book("3", "Clean Code", "Robert C. Martin")
        );
    }
}
