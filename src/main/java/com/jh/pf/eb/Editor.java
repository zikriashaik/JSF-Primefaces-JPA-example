package com.jh.pf.eb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Editor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String value;

	public int getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}