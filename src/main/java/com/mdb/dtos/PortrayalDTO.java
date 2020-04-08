package com.mdb.dtos;

import java.util.Objects;

public class PortrayalDTO {
	private int id;
	private CharacterDTO character;
	private PersonDTO person;
	private boolean voiceOnly = false;


	public PortrayalDTO() {
	}

	public PortrayalDTO(int id, CharacterDTO character, PersonDTO person, boolean voiceOnly) {
		this.id = id;
		this.character = character;
		this.person = person;
		this.voiceOnly = voiceOnly;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CharacterDTO getCharacter() {
		return this.character;
	}

	public void setCharacter(CharacterDTO character) {
		this.character = character;
	}

	public PersonDTO getPerson() {
		return this.person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

	public boolean isVoiceOnly() {
		return this.voiceOnly;
	}

	public boolean getVoiceOnly() {
		return this.voiceOnly;
	}

	public void setVoiceOnly(boolean voiceOnly) {
		this.voiceOnly = voiceOnly;
	}

	public PortrayalDTO id(int id) {
		this.id = id;
		return this;
	}

	public PortrayalDTO character(CharacterDTO character) {
		this.character = character;
		return this;
	}

	public PortrayalDTO person(PersonDTO person) {
		this.person = person;
		return this;
	}

	public PortrayalDTO voiceOnly(boolean voiceOnly) {
		this.voiceOnly = voiceOnly;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PortrayalDTO)) {
			return false;
		}
		PortrayalDTO portrayalDTO = (PortrayalDTO) o;
		return id == portrayalDTO.id && Objects.equals(character, portrayalDTO.character) && Objects.equals(person, portrayalDTO.person) && voiceOnly == portrayalDTO.voiceOnly;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, character, person, voiceOnly);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", character='" + getCharacter() + "'" +
			", person='" + getPerson() + "'" +
			", voiceOnly='" + isVoiceOnly() + "'" +
			"}";
	}

}
