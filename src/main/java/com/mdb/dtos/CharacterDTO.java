package com.mdb.dtos;

import java.util.Objects;

public class CharacterDTO {
	private int id;
	private String name;


	public CharacterDTO() {
	}

	public CharacterDTO(int id, String name) {
		this.id = id;
		this.name = name;
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

	public CharacterDTO id(int id) {
		this.id = id;
		return this;
	}

	public CharacterDTO name(String name) {
		this.name = name;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof CharacterDTO)) {
			return false;
		}
		CharacterDTO characterDTO = (CharacterDTO) o;
		return id == characterDTO.id && Objects.equals(name, characterDTO.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			"}";
	}

}
