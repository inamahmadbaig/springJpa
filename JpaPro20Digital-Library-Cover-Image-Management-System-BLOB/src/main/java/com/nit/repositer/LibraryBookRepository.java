package com.nit.repositer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.LibraryBook;

public interface LibraryBookRepository extends JpaRepository<LibraryBook, Long> {

}
