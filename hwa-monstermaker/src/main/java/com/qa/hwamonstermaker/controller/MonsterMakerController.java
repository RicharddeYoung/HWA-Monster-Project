package com.qa.hwamonstermaker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwamonstermaker.domain.MonsterMaker;
import com.qa.hwamonstermaker.services.MonsterMakerService;

@RestController
@CrossOrigin
@RequestMapping("/monstermaker")
public class MonsterMakerController {
	
	private MonsterMakerService service;
	
	public MonsterMakerController(MonsterMakerService service) {
		this.service = service;
	}
	
//	CREATE
	@PostMapping("/create")
	public ResponseEntity<MonsterMaker> create(@RequestBody MonsterMaker monsterMaker) {
		return new ResponseEntity<MonsterMaker>(service.create(monsterMaker), HttpStatus.CREATED);
	}
	
//	READ
	@GetMapping("/get/{monsterId}")
	public ResponseEntity<MonsterMaker> getById(@PathVariable long monsterId) {
		return new ResponseEntity<MonsterMaker>(service.getById(monsterId), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<MonsterMaker>> getAll() {
		return new ResponseEntity<List<MonsterMaker>>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/getByFamily/{monsterFamily}")
	public ResponseEntity<List<MonsterMaker>> getByFamily(@PathVariable String monsterFamily) {
		return new ResponseEntity<List<MonsterMaker>>(service.getByFamily(monsterFamily), HttpStatus.OK);
	}
	
	@GetMapping("/getByDiet/{monsterDiet}")
	public ResponseEntity<List<MonsterMaker>> getByDiet(@PathVariable String monsterDiet) {
		return new ResponseEntity<List<MonsterMaker>>(service.getByDiet(monsterDiet), HttpStatus.OK);
	}
	
	@GetMapping("/getByOrigin/{monsterOrigin}")
	public ResponseEntity<List<MonsterMaker>> getByOrigin(@PathVariable String monsterOrigin) {
		return new ResponseEntity<List<MonsterMaker>>(service.getByOrigin(monsterOrigin), HttpStatus.OK);
	}
	
	@GetMapping("/getByFlight/{monsterFlight}")
	public ResponseEntity<List<MonsterMaker>> getByFlight(@PathVariable Boolean monsterFlight) {
		return new ResponseEntity<List<MonsterMaker>>(service.getByFlight(monsterFlight), HttpStatus.OK);
	}
	
	@GetMapping("/getBySwim/{monsterSwim}")
	public ResponseEntity<List<MonsterMaker>> getBySwim(@PathVariable Boolean monsterSwim) {
		return new ResponseEntity<List<MonsterMaker>>(service.getBySwim(monsterSwim), HttpStatus.OK);
	}
	
	@GetMapping("/getByFamilyAndDiet/{monsterFamily}/{monsterDiet}")
	public ResponseEntity<List<MonsterMaker>> getByFamilyAndDiet(@PathVariable String monsterFamily, String monsterDiet) {
		return new ResponseEntity<List<MonsterMaker>>(service.getByFamilyAndDiet(monsterFamily, monsterDiet), HttpStatus.OK);
	}
	
	@GetMapping("/getByFamilyAndOrigin/{monsterFamily}/{monsterOrigin}")
	public ResponseEntity<List<MonsterMaker>> getByFamilyAndOrigin(@PathVariable String monsterFamily, String monsterOrigin) {
		return new ResponseEntity<List<MonsterMaker>>(service.getByFamilyAndOrigin(monsterFamily, monsterOrigin), HttpStatus.OK);
	}
	
	@GetMapping("/getByDietAndOrigin/{monsterDiet}/{monsterOrigin}")
	public ResponseEntity<List<MonsterMaker>> getByDietAndOrigin(@PathVariable String monsterDiet, String monsterOrigin) {
		return new ResponseEntity<List<MonsterMaker>>(service.getByDietAndOrigin(monsterDiet, monsterOrigin), HttpStatus.OK);
	}
	
//	UPDATE
	@PutMapping("/update/{monsterId}")
	public ResponseEntity<MonsterMaker> update(@PathVariable long monsterId, @RequestBody MonsterMaker monsterMaker) {
		return new ResponseEntity<MonsterMaker>(service.update(monsterId, monsterMaker), HttpStatus.ACCEPTED);
	}
	
//	DELETE
	@DeleteMapping("/delete/{monsterId}")
	public ResponseEntity<MonsterMaker> remove(@PathVariable long monsterId) {
		return service.remove(monsterId) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
