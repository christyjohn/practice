package com.christy;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.christy.business.ProductServiceImpl;
import com.christy.model.Product;

@WebService(name="TestMartCatalog", portName = "TestMartCatalogPort",
		serviceName = "TestMartCatalogService", 
		targetNamespace = "http://www.testmart.com")
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories() {		
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	@WebMethod	
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	@WebMethod
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
	
}
