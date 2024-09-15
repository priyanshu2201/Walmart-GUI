package com.gui.service;

import java.util.List;

import com.gui.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();

	public List<Product> getAllProductByType(String name);

	public List<Product> getAllProductByRating(int rating);

	public List<Product> getAllProductByPrice(int price);
	
	public List<Product> getAllProductByElectronic();
	
	public List<Product> getAllProductByMen();

	public List<Product> getAllProductByWomen();
	
	public List<Product> getAllProductByJewelery();


}
