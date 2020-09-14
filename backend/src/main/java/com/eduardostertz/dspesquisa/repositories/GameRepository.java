package com.eduardostertz.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardostertz.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
