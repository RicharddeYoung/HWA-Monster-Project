package com.qa.hwamonstermaker.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.hwamonstermaker.domain.MonsterMaker;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = {"classpath:testschema.sql", "classpath:testdata.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class MonsterMakerControllerIntegrationTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
//	CREATE TEST
	@Test
	public void createTest() throws Exception {
		MonsterMaker input = new MonsterMaker("Bakujira", "Mammal", "Carnivore", false, true, "Japanese");
		String inputAsJSON = mapper.writeValueAsString(input);
		
		MonsterMaker output = new MonsterMaker(2L, "Bakujira", "Mammal", "Carnivore", false, true, "Japanese");
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(post("/monstermaker/create")
			.contentType(MediaType.APPLICATION_JSON)
			.content(inputAsJSON))
			.andExpect(status().isCreated())
			.andExpect(content().json(outputAsJSON));
	}
	
//	READ TESTS
	@Test
	public void getByIdTest() throws Exception {
		MonsterMaker entry = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		String entryAsJSON = mapper.writeValueAsString(entry);
		
		mvc.perform(get("/monstermaker/get/1")
			.contentType(MediaType.APPLICATION_JSON)
			.content(entryAsJSON))
			.andExpect(status().isOk())
			.andExpect(content().json(entryAsJSON));
	}
	
	@Test
	public void getAllTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getAll")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
//	@Disabled
	@Test
	public void getByOriginTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getByOrigin/Melanesian")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
//	@Disabled
	@Test
	public void getByFamilyTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getByFamily/Fish")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
//	@Disabled
	@Test
	public void getByDietTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getByDiet/Piscivore")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
//	@Disabled
	@Test
	public void getByFlightTest() throws Exception {
		mvc.perform(get("/monstermaker/getByFlight/false")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}
	
//	@Disabled
	@Test
	public void getBySwimTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getBySwim/true")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
//	@Disabled
	@Test
	public void getByFamilyAndOriginTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getByFamilyAndOrigin/Fish/Melanesian")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
//	@Disabled
	@Test
	public void getByFamilyAndDietTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getByFamilyAndDiet/Fish/Piscivore")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
//	@Disabled
	@Test
	public void getByDietAndOriginTest() throws Exception {
		MonsterMaker monster = new MonsterMaker(1L, "Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(monster);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/monstermaker/getByDietAndOrigin/Piscivore/Melanesian")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().json(outputAsJSON));
	}
	
	
//	UPDATE TEST
//	@Disabled
	@Test
	public void updateTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Jorogumo", "Arthropod", "Carnivore", false, false, "Japanese");
		MonsterMaker result = new MonsterMaker(1L, "Jorogumo", "Arthropod", "Carnivore", false, false, "Japanese");
		String entryAsJSON = mapper.writeValueAsString(entry);
		String resultAsJSON = mapper.writeValueAsString(result);
		
		mvc.perform(put("/monstermaker/update/1")
			.contentType(MediaType.APPLICATION_JSON)
			.content(entryAsJSON))
			.andExpect(status().isAccepted())
			.andExpect(content().json(resultAsJSON));
	}
	
	
//	DELETE TEST
//	@Disabled
	@Test
	public void removeTest() throws Exception {
		mvc.perform(delete("/monstermaker/delete/1")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isNoContent());
	}

}
