package edu.montran.catalogcomponent.products;


public class Product extends Base{

	private static final long serialVersionUID = 5631953812797128869L;

	public Product() {
		
	}
	
	public Product(int idProduct, String longName, String description) {
		this.id = idProduct;
		this.name = longName;
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
