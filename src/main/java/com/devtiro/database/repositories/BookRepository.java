package com.devtiro.database.repositories;

import org.springframework.data.repository.CrudRepository;

import com.devtiro.database.domain.Book;

public interface BookRepository extends CrudRepository<Book, String> {
}
