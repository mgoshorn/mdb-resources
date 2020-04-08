package com.mdb.dtos;

import java.time.LocalDate;
import java.util.Objects;

public class MovieDTO {
	private int id;
	private String title;
	private LocalDate releaseDate;

	public MovieDTO() {
	}

	public MovieDTO(int id, String title, LocalDate releaseDate) {
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public MovieDTO id(int id) {
		this.id = id;
		return this;
	}

	public MovieDTO title(String title) {
		this.title = title;
		return this;
	}

	public MovieDTO releaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MovieDTO)) {
			return false;
		}
		MovieDTO movieDTO = (MovieDTO) o;
		return id == movieDTO.id && Objects.equals(title, movieDTO.title) && Objects.equals(releaseDate, movieDTO.releaseDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, releaseDate);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", title='" + getTitle() + "'" +
			", releaseDate='" + getReleaseDate() + "'" +
			"}";
	}

	
}
