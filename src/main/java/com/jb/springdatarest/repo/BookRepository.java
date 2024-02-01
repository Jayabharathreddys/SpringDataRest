package com.jb.springdatarest.repo;

import com.jb.springdatarest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RepositoryRestResource(path="books")
public interface BookRepository extends JpaRepository<Book, Integer> {

    public List<Book> findByName(@Param("name") String name);
}
