package de.laliluna.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Honey {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String taste;

	public Honey() {

	}

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getTaste() {

		return taste;
	}

	public void setTaste(String taste) {

		this.taste = taste;
	}

	public String toString() {

		return "Honey: " + getId() + " Name: " + getName() + " Taste: " + getTaste();
	}
}
