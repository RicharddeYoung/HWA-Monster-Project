package com.qa.hwamonstermaker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping()

}
