package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.GymMember;

public interface GymMemberRepository extends JpaRepository<GymMember, Long> {

}
