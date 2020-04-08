package com.mdb.dtos;

import java.time.LocalDate;
import java.util.Objects;

public class PersonDTO {
	private int id;
	private String name;
	private LocalDate birthDate;
	private LocalDate deathDate;


	public PersonDTO() {
	}

	public PersonDTO(int id, String name, LocalDate birthDate, LocalDate deathDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDate getDeathDate() {
		return this.deathDate;
	}

	public void setDeathDate(LocalDate deathDate) {
		this.deathDate = deathDate;
	}

	public PersonDTO id(int id) {
		this.id = id;
		return this;
	}

	public PersonDTO name(String name) {
		this.name = name;
		return this;
	}

	public PersonDTO birthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public PersonDTO deathDate(LocalDate deathDate) {
		this.deathDate = deathDate;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PersonDTO)) {
			return false;
		}
		PersonDTO personDTO = (PersonDTO) o;
		return id == personDTO.id && Objects.equals(name, personDTO.name) && Objects.equals(birthDate, personDTO.birthDate) && Objects.equals(deathDate, personDTO.deathDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, birthDate, deathDate);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", birthDate='" + getBirthDate() + "'" +
			", deathDate='" + getDeathDate() + "'" +
			"}";
	}

}
