package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.BookS;

public interface BookRepository extends JpaRepository<BookS, Long> {

}
