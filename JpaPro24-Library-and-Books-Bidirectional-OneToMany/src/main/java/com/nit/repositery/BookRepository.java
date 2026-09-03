package com.nit.repositery;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Books;

public interface BookRepository extends JpaRepository<Books, Long> {

}
