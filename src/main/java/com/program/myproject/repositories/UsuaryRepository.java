package com.program.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.myproject.entities.Usuary;

public interface UsuaryRepository extends JpaRepository<Usuary, Long> {

}
