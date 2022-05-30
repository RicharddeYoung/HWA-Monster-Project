package com.qa.hwamonstermaker.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MonsterMaker {
	
//	PROPERTIES
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long monsterId;
	
	@Column(nullable = false)
	private String monsterName;
	
	@Column(nullable = false)
	private String monsterFamily;
	
	@Column(nullable = false)
	private String monsterDiet;
	
	@Column
	private boolean monsterFlight;
	
	@Column
	private boolean monsterSwim;
	
	@Column(nullable = false)
	private String monsterOrigin;

	
//	CONSTRUCTORS
	public MonsterMaker(long monsterId, String monsterName, String monsterFamily, String monsterDiet,
			boolean monsterFlight, boolean monsterSwim, String monsterOrigin) {
		super();
		this.monsterId = monsterId;
		this.monsterName = monsterName;
		this.monsterFamily = monsterFamily;
		this.monsterDiet = monsterDiet;
		this.monsterFlight = monsterFlight;
		this.monsterSwim = monsterSwim;
		this.monsterOrigin = monsterOrigin;
	}

	public MonsterMaker(String monsterName, String monsterFamily, String monsterDiet, boolean monsterFlight,
			boolean monsterSwim, String monsterOrigin) {
		super();
		this.monsterName = monsterName;
		this.monsterFamily = monsterFamily;
		this.monsterDiet = monsterDiet;
		this.monsterFlight = monsterFlight;
		this.monsterSwim = monsterSwim;
		this.monsterOrigin = monsterOrigin;
	}

	public MonsterMaker() {
		super();
	}

	
//	GETTERS AND SETTERS
	public long getMonsterId() {
		return monsterId;
	}

	public void setMonsterId(long monsterId) {
		this.monsterId = monsterId;
	}

	public String getMonsterName() {
		return monsterName;
	}

	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}

	public String getMonsterFamily() {
		return monsterFamily;
	}

	public void setMonsterFamily(String monsterFamily) {
		this.monsterFamily = monsterFamily;
	}

	public String getMonsterDiet() {
		return monsterDiet;
	}

	public void setMonsterDiet(String monsterDiet) {
		this.monsterDiet = monsterDiet;
	}

	public boolean isMonsterFlight() {
		return monsterFlight;
	}

	public void setMonsterFlight(boolean monsterFlight) {
		this.monsterFlight = monsterFlight;
	}

	public boolean isMonsterSwim() {
		return monsterSwim;
	}

	public void setMonsterSwim(boolean monsterSwim) {
		this.monsterSwim = monsterSwim;
	}

	public String getMonsterOrigin() {
		return monsterOrigin;
	}

	public void setMonsterOrigin(String monsterOrigin) {
		this.monsterOrigin = monsterOrigin;
	}

	
//	HASHCODE AND EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(monsterDiet, monsterFamily, monsterFlight, monsterId, monsterName, monsterOrigin,
				monsterSwim);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonsterMaker other = (MonsterMaker) obj;
		return Objects.equals(monsterDiet, other.monsterDiet) && Objects.equals(monsterFamily, other.monsterFamily)
				&& monsterFlight == other.monsterFlight && monsterId == other.monsterId
				&& Objects.equals(monsterName, other.monsterName) && Objects.equals(monsterOrigin, other.monsterOrigin)
				&& monsterSwim == other.monsterSwim;
	}
	
}
