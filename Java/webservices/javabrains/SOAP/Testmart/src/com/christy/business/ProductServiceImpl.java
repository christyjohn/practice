package com.christy.business;

import java.util.ArrayList;
import java.util.List;

import com.christy.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");

		musicList.add("Random Access Memories");
		musicList.add("Night visions");
		musicList.add("Unorthodox Jukebox");

		movieList.add("Oz the Great and the Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek into the Darkness");		
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
			case "books":
				return bookList;
			case "music":
				return musicList;
			case "movies":
				return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product)
	{
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
		case "music":
			musicList.add(product);
		case "movies":
			movieList.add(product);
	}
	return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book", "1234", 99999));
		productList.add(new Product("Another Book", "abc", 50));
		return productList;
	}
	
}
