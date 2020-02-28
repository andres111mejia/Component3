package edu.montran.catalogcomponent.products;

import java.io.Serializable;

public abstract class Base implements Serializable {

	private static final long serialVersionUID = -8192443565038249778L;

	protected int id;
	
	protected String name;
	
	protected String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
