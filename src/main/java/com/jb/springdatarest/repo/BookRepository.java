package com.jb.springdatarest.repo;

import com.jb.springdatarest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
