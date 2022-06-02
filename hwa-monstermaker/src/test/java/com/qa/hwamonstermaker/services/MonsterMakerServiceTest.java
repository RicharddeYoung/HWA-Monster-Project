package com.qa.hwamonstermaker.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.hwamonstermaker.domain.MonsterMaker;
import com.qa.hwamonstermaker.interfaces.MonsterMakerRepo;
import com.qa.hwamonstermaker.services.MonsterMakerService;

@SpringBootTest
public class MonsterMakerServiceTest {
	
	@Autowired
	private MonsterMakerService service;
	
	@MockBean
	private MonsterMakerRepo repo;
	
//	CREATE TEST
//	@Disabled
	@Test
	public void createTest() {
		final MonsterMaker created = new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian");
		
		Mockito.when(repo.saveAndFlush(created)).thenReturn(created);
		
		assertEquals(created, service.create(created));
		
		Mockito.verify(repo, Mockito.times(1)).saveAndFlush(created);
	}

//	READ TESTS
//	@Disabled
	@Test
	public void getByIdTest() {
		final MonsterMaker output = new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian");
		
		Mockito.when(repo.findById(1L)).thenReturn(Optional.of(output));
		
		assertEquals(output, service.getById(1L));
		
		Mockito.verify(repo, Mockito.times(1)).findById(1L);
	}

//	@Disabled
	@Test
	public void getAllTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findAll()).thenReturn(output);
		
		assertEquals(output, service.getAll());
		
		Mockito.verify(repo, Mockito.times(1)).findAll();
	}
	
//	@Disabled
	@Test
	public void getByOriginTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findByMonsterOrigin("Melanesian")).thenReturn(output);
		
		assertEquals(output, service.getByOrigin("Melanesian"));
		
		Mockito.verify(repo, Mockito.times(1)).findByMonsterOrigin("Melanesian");
	}
	
//	@Disabled
	@Test
	public void getByFamilyTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findByMonsterFamily("Fish")).thenReturn(output);
		
		assertEquals(output, service.getByFamily("Fish"));
		
		Mockito.verify(repo, Mockito.times(1)).findByMonsterFamily("Fish");
	}
	
//	@Disabled
	@Test
	public void getByDietTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findByMonsterDiet("Piscivore")).thenReturn(output);
		
		assertEquals(output, service.getByDiet("Piscivore"));
		
		Mockito.verify(repo, Mockito.times(1)).findByMonsterDiet("Piscivore");
	}
	
//	@Disabled
	@Test
	public void getByFlightTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findByFlightAbility(false)).thenReturn(output);
		
		assertEquals(output, service.getByFlight(false));
		
		Mockito.verify(repo, Mockito.times(1)).findByFlightAbility(false);
	}
	
//	@Disabled
	@Test
	public void getBySwimTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findBySwimAbility(true)).thenReturn(output);
		
		assertEquals(output, service.getBySwim(true));
		
		Mockito.verify(repo, Mockito.times(1)).findBySwimAbility(true);
	}
	
//	@Disabled
	@Test
	public void getByOriginAndFamilyTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findByFamilyAndOrigin("Fish","Melanesian")).thenReturn(output);
		
		assertEquals(output, service.getByFamilyAndOrigin("Fish","Melanesian"));
		
		Mockito.verify(repo, Mockito.times(1)).findByFamilyAndOrigin("Fish","Melanesian");
	}
	
//	@Disabled
	@Test
	public void getByDietAndFamilyTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findByFamilyAndDiet("Fish","Piscivore")).thenReturn(output);
		
		assertEquals(output, service.getByFamilyAndDiet("Fish","Piscivore"));
		
		Mockito.verify(repo, Mockito.times(1)).findByFamilyAndDiet("Fish","Piscivore");
	}
	
//	@Disabled
	@Test
	public void getByDietAndOriginTest() {
		List<MonsterMaker> output = new ArrayList<>();
		output.add(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		
		Mockito.when(repo.findByDietAndOrigin("Piscivore","Melanesian")).thenReturn(output);
		
		assertEquals(output, service.getByDietAndOrigin("Piscivore","Melanesian"));
		
		Mockito.verify(repo, Mockito.times(1)).findByDietAndOrigin("Piscivore","Melanesian");
	}

//	UPDATE TEST
//	@Disabled
	@Test
	public void updateTest() {
		MonsterMaker input = new MonsterMaker("Harpy", "Avian", "Omnivore", true, false, "Greek");
		Optional<MonsterMaker> existing = Optional.of(new MonsterMaker(1L, "Abaia","Fish","Piscivore",false,true,"Melanesian"));
		MonsterMaker output = new MonsterMaker(1L, "Harpy", "Avian", "Omnivore", true, false, "Greek");
		
		Mockito.when(repo.findById(1L)).thenReturn(existing);
		Mockito.when(repo.saveAndFlush(output)).thenReturn(output);
		
		assertEquals(output, service.update(1L, input));
		
		Mockito.verify(repo, Mockito.times(1)).saveAndFlush(output);
		Mockito.verify(repo, Mockito.times(1)).findById(1L);
		
	}

//	DELETE TEST
//	@Disabled
	@Test
	public void removeTest() {
		final long Id = 1L;
		Mockito.when(repo.existsById(Id)).thenReturn(false);
	
		assertEquals(true, service.remove(Id));
		
		Mockito.verify(repo, Mockito.times(1)).deleteById(Id);
		Mockito.verify(repo, Mockito.times(1)).existsById(Id);
	}

}
