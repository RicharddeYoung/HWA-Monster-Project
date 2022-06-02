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
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.hwamonstermaker.domain.MonsterMaker;
import com.qa.hwamonstermaker.services.MonsterMakerService;

@WebMvcTest
public class MonsterMakerControllerUnitTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@MockBean
	private MonsterMakerService service;
	
//	CREATE TEST
	@Test
	public void createTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		String entryAsJSON = mapper.writeValueAsString(entry);
		
		Mockito.when(service.create(entry)).thenReturn(entry);
		
		mvc.perform(post("/monstermaker/create")
				.contentType(MediaType.APPLICATION_JSON)
				.content(entryAsJSON))
				.andExpect(status().isCreated())
				.andExpect(content().json(entryAsJSON));
	}
	
//	READ TESTS
	@Test
	public void getAllTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(this.service.getAll()).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getAll")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
	@Test
	public void getByIdTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		String entryAsJSON = mapper.writeValueAsString(entry);
		
		Mockito.when(service.getById(1L)).thenReturn(entry);
		
		mvc.perform(get("/monstermaker/get/1")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(entryAsJSON));
	}
	
	@Test
	public void getByFamilyTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(service.getByFamily("Fish")).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getByFamily/Fish")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
	@Test
	public void getByDietTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(service.getByDiet("Piscivore")).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getByDiet/Piscivore")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
	@Test
	public void getByOriginTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(service.getByOrigin("Melanesian")).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getByOrigin/Melanesian")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
	@Test
	public void getByFlight() throws Exception {
		Mockito.when(service.getByFlight(false)).thenReturn(null);
		
		mvc.perform(get("/monstermaker/getByFlight/false")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
	@Test
	public void getBySwim() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(service.getBySwim(true)).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getBySwim/true")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
	@Test
	public void getByFamilyAndOriginTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(service.getByFamilyAndOrigin("Fish","Melanesian")).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getByFamilyAndOrigin/Fish/Melanesian")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
	@Test
	public void getByFamilyAndDietTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(service.getByFamilyAndDiet("Fish","Piscivore")).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getByFamilyAndDiet/Fish/Piscivore")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
	@Test
	public void getByDietAndOriginTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		List<MonsterMaker> output = new ArrayList<>();
		output.add(entry);
		String outputAsJSON = mapper.writeValueAsString(output);
		
		Mockito.when(service.getByDietAndOrigin("Piscivore","Melanesian")).thenReturn(output);
		
		mvc.perform(get("/monstermaker/getByDietAndOrigin/Piscivore/Melanesian")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(outputAsJSON));
	}
	
//	UPDATE TESTS
	@Test
	public void updateTest() throws Exception {
		MonsterMaker entry = new MonsterMaker("Abaia", "Fish", "Piscivore", false, true, "Melanesian");
		String entryAsJSON = mapper.writeValueAsString(entry);
		
		Mockito.when(this.service.update(1L, entry)).thenReturn(entry);
		
		mvc.perform(put("/monstermaker/update/1")
				.contentType(MediaType.APPLICATION_JSON)
				.content(entryAsJSON))
				.andExpect(status().isAccepted())
				.andExpect(content().json(entryAsJSON));
	}
	
//	DELETE TESTS
	@Test
	public void deletePassTest() throws Exception {
		Mockito.when(service.remove(1L)).thenReturn(true);
		
		mvc.perform(delete("/monstermaker/delete/1")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNoContent());
	}
	
	@Test
	public void deleteFailTest() throws Exception {
		Mockito.when(service.remove(1L)).thenReturn(false);
		
		mvc.perform(delete("/monstermaker/delete/1")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());
	}

}
