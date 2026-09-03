package com.nit.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
