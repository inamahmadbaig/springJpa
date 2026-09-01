package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.PanCard;

public interface PanCardRepository extends JpaRepository<PanCard, Long> {

}
