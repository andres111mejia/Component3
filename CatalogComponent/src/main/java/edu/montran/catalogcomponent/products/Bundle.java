package edu.montran.catalogcomponent.products;

import java.math.BigDecimal;
import java.util.List;

public class Bundle extends Base {

	private static final long serialVersionUID = 5848290001234731789L;

	public List<Product> listProducts;
	
	public BigDecimal price;
	
	public Bundle () {
		
	}
	
	public Bundle (int idBundle, String name, String description, List<Product> listProducts, BigDecimal price) {
		this.id = idBundle;
		this.name = name;
		this.description = description;
		this.listProducts = listProducts;
		this.price = price;
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
