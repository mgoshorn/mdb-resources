package com.mdb.dtos;

import java.util.Objects;

public class CrewDTO {
	private int id;
	private PersonDTO person;
	private String position;

	public CrewDTO() {
	}

	public CrewDTO(int id, PersonDTO person, String position) {
		this.id = id;
		this.person = person;
		this.position = position;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PersonDTO getPerson() {
		return this.person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public CrewDTO id(int id) {
		this.id = id;
		return this;
	}

	public CrewDTO person(PersonDTO person) {
		this.person = person;
		return this;
	}

	public CrewDTO position(String position) {
		this.position = position;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof CrewDTO)) {
			return false;
		}
		CrewDTO crewDTO = (CrewDTO) o;
		return id == crewDTO.id && Objects.equals(person, crewDTO.person) && Objects.equals(position, crewDTO.position);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, person, position);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", person='" + getPerson() + "'" +
			", position='" + getPosition() + "'" +
			"}";
	}	
}
