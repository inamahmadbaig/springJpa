package com.nit.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.RentalBook;

public interface RentalBookRepository extends JpaRepository<RentalBook, Long> {

}
