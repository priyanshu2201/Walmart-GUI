package com.gui.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gui.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private RestTemplate restTemplate;

	private List<Product> productList = new ArrayList<Product>();

	@Override
	public List<Product> getAllProducts() {
		if (productList.size() == 0) {
			
			Product[] product = restTemplate.getForObject("http://localhost:1111/getAllProducts", Product[].class);

			productList = Arrays.asList(product);
		}
		return productList;
	}

	@Override
	public List<Product> getAllProductByType(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProductByElectronic(){
		
		return productList.stream().filter(obj-> obj.getProductType().equalsIgnoreCase("electronics") ).collect(Collectors.toList());
	}

	@Override
	public List<Product> getAllProductByMen() {
		
		return productList.stream().filter(obj-> obj.getProductType().equalsIgnoreCase("men's clothing") ).collect(Collectors.toList());
		
	}

	@Override
	public List<Product> getAllProductByWomen() {
		// TODO Auto-generated method stub
		return productList.stream().filter(obj-> obj.getProductType().equalsIgnoreCase("women's clothing") ).collect(Collectors.toList());
	}

	@Override
	public List<Product> getAllProductByJewelery() {
		// TODO Auto-generated method stub
		 return productList.stream().filter(obj-> obj.getProductType().equalsIgnoreCase("jewelery") ).collect(Collectors.toList());
	}
}
