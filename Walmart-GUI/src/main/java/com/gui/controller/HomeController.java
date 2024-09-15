package com.gui.controller;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gui.model.Product;
import com.gui.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	private ProductService productService;

	@Autowired
	private HttpSession session;

	@GetMapping(value = { "/", "/home" })
	public String getHome() throws Exception {
		
		List<Product> allProducts = productService.getAllProducts();

		Collections.shuffle(allProducts);
		session.setAttribute("productData", allProducts);

		System.out.println(allProducts);
		return "Home";
	}

	@GetMapping("/electronic")
	public String getElectronic() {

		List<Product> allProductByElectronic = productService.getAllProductByElectronic();

		Collections.shuffle(allProductByElectronic);

		session.setAttribute("productData", allProductByElectronic);
		return "electronic";
	}

	@GetMapping("/men")
	public String getAllProductByMen() {
		
		List<Product> allProductByMen = productService.getAllProductByMen();

		Collections.shuffle(allProductByMen);

		session.setAttribute("productData", allProductByMen);
		return "men";
	}

	@GetMapping("/women")
	public String getAllProductByWomen() {
		List<Product> allProductByWomen = productService.getAllProductByWomen();

		Collections.shuffle(allProductByWomen);

		session.setAttribute("productData", allProductByWomen);
		return "women";
	}

	@GetMapping("/jewelery")
	public String getAllProductByJewelery() {

		List<Product> allProductByJ = productService.getAllProductByJewelery();

		Collections.shuffle(allProductByJ);

		session.setAttribute("productData", allProductByJ);
		return "jewelery";
	}

	@GetMapping("/footer")
	public String footer() {
		return "footer";
	}
}
