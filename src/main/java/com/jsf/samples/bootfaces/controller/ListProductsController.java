package com.jsf.samples.bootfaces.controller;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsf.samples.bootfaces.entity.Product;
import com.jsf.samples.bootfaces.service.ProductService;

@Component (value = "listProducts")
@ELBeanName(value = "listProducts")
@Join(path = "/product-list", to = "/WEB-INF/pages/product/product-list.jsf")
public class ListProductsController extends BaseController {
	
	@Autowired
	private ProductService productService;

	private List<Product> products;

	public List<Product> getProducts() {
		products = productService.getAll();
		return products;
	}

	public String delete(Product product) {
		productService.delete(product);
		products = productService.getAll();
		return null;
	}
}
