package com.eduardostertz.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardostertz.dspesquisa.entities.Genre;


@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
