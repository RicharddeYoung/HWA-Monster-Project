package com.qa.hwamonstermaker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.hwamonstermaker.domain.MonsterMaker;
import com.qa.hwamonstermaker.exceptions.MonsterNotFoundExceptionWithId;
import com.qa.hwamonstermaker.interfaces.MonsterMakerRepo;

@Service
public class MonsterMakerService {
	
	private MonsterMakerRepo repo;
	
	public MonsterMakerService(MonsterMakerRepo repo) {
		this.repo = repo;
	}
	
//	CREATE
	public MonsterMaker create(MonsterMaker monsterMaker) {
		return repo.saveAndFlush(monsterMaker);
	}
	
//	READ
	public MonsterMaker getById(long monsterId) {
		return repo.findById(monsterId).orElseThrow(() -> new MonsterNotFoundExceptionWithId(monsterId));
	}
	
	public List<MonsterMaker> getAll() {
		return repo.findAll();
	}
	
	public List<MonsterMaker> getByFamily(String monsterFamily) {
		return repo.findByMonsterFamily(monsterFamily);
	}
	
	public List<MonsterMaker> getByDiet(String monsterDiet) {
		return repo.findByMonsterDiet(monsterDiet);
	}
	
	public List<MonsterMaker> getByOrigin(String monsterOrigin) {
		return repo.findByMonsterOrigin(monsterOrigin);
	}
	
	public List<MonsterMaker> getByFlight(Boolean monsterFlight) {
		return repo.findByFlightAbility(monsterFlight);
	}
	
	public List<MonsterMaker> getBySwim(Boolean monsterSwim) {
		return repo.findBySwimAbility(monsterSwim);
	}
	
	public List<MonsterMaker> getByFamilyAndDiet(String monsterFamily, String monsterDiet) {
		return repo.findByFamilyAndDiet(monsterFamily, monsterDiet);
	}
	
	public List<MonsterMaker> getByFamilyAndOrigin(String monsterFamily, String monsterOrigin) {
		return repo.findByFamilyAndOrigin(monsterFamily, monsterOrigin);
	}
	
	public List<MonsterMaker> getByDietAndOrigin(String monsterDiet, String monsterOrigin) {
		return repo.findByDietAndOrigin(monsterDiet, monsterOrigin);
	}
	
//	UPDATE
	public MonsterMaker update(long monsterId, MonsterMaker newMonster) {
		MonsterMaker existing = repo.findById(monsterId).get();
		
		existing.setMonsterName(newMonster.getMonsterName());
		existing.setMonsterFamily(newMonster.getMonsterFamily());
		existing.setMonsterDiet(newMonster.getMonsterDiet());
		existing.setMonsterFlight(newMonster.isMonsterFlight());
		existing.setMonsterSwim(newMonster.isMonsterSwim());
		existing.setMonsterOrigin(newMonster.getMonsterOrigin());
		
		return repo.saveAndFlush(existing);
	}
	
//	DELETE
	public boolean remove(long monsterId) {
		repo.deleteById(monsterId);
		return !repo.existsById(monsterId);
	}

}
