package edu.montran.catalogcomponent.products;

public class Atributes {
	private String name, value, type;
	private int idAtribute;
	public Atributes() {}
	public Atributes(int id,String[] atributeDef) {
		this.idAtribute=id;
		this.name=atributeDef[0];
		this.value=atributeDef[1];
		this.type=atributeDef[2];
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getIdAtribute() {
		return idAtribute;
	}
	public void setIdAtribute(int idAtribute) {
		this.idAtribute = idAtribute;
	}

}
