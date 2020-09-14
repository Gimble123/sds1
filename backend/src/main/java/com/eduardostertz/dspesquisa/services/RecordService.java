package com.eduardostertz.dspesquisa.services;



import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardostertz.dspesquisa.dto.RecordDTO;
import com.eduardostertz.dspesquisa.dto.RecordInsertDTO;
import com.eduardostertz.dspesquisa.entities.Game;
import com.eduardostertz.dspesquisa.entities.Record;
import com.eduardostertz.dspesquisa.repositories.GameRepository;
import com.eduardostertz.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository GameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = GameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		repository.save(entity);
		return new RecordDTO(entity);
		
	}
}
