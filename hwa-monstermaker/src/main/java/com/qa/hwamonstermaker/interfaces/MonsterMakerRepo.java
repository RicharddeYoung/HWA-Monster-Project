package com.qa.hwamonstermaker.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.hwamonstermaker.domain.MonsterMaker;

@Repository
public interface MonsterMakerRepo extends JpaRepository<MonsterMaker, Long> {
	
//	DERIVED QUERIES
	List<MonsterMaker> findByMonsterFamily(String monsterFamily);
	
	List<MonsterMaker> findByMonsterDiet(String monsterDiet);
	
	List<MonsterMaker> findByMonsterOrigin(String monsterOrigin);
	
	
	@Query(value = "SELECT * FROM monsters WHERE monster_flight = true", nativeQuery=true)
	List<MonsterMaker> findByFlightAbility(boolean monsterFlight);
	
	@Query(value = "SELECT * FROM monsters WHERE monster_swim = true", nativeQuery=true)
	List<MonsterMaker> findBySwimAbility(boolean monsterSwim);
	
	@Query(value = "SELECT * FROM monsters WHERE monster_family = ?1 AND monster_diet = ?2", nativeQuery=true)
	List<MonsterMaker> findByFamilyAndDiet(String monsterFamily, String monsterDiet);
	
	@Query(value = "SELECT * FROM monsters WHERE monster_family = ?1 AND monster_origin = ?2", nativeQuery=true)
	List<MonsterMaker> findByFamilyAndOrigin(String monsterFamily, String monsterOrigin);
	
	@Query(value = "SELECT * FROM monsters WHERE monster_diet = ?1 AND monster_origin = ?2", nativeQuery=true)
	List<MonsterMaker> findByDietAndOrigin(String monsterDiet, String monsterOrigin);

}