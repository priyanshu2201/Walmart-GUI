package com.gui.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Product implements Serializable {
	
	private Integer id;
	private String title;
	private String description;
	@JsonProperty("category")
	private String productType;
	private double price;
	private Rating rating;
	@JsonProperty("image")
	private String productImageUrl;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Product(Integer id, String title, String description, String productType, double price, Rating rating,
			String productImageUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.productType = productType;
		this.price = price;
		this.rating = rating;
		this.productImageUrl = productImageUrl;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", productType="
				+ productType + ", price=" + price + ", rating=" + rating + ", productImageUrl=" + productImageUrl
				+ "]";
	}

	

}
