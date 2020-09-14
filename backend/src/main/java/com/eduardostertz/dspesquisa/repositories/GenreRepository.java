package com.eduardostertz.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardostertz.dspesquisa.entities.Record;

public interface GenreRepository extends JpaRepository<Record, Long> {

}
