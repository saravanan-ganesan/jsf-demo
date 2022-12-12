package com.jsf.samples.bootfaces.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsf.samples.bootfaces.entity.Product;
import com.jsf.samples.bootfaces.service.ProductService;

@Component (value = "productController")
@ELBeanName(value = "productController")
@Join(path = "/product", to = "/WEB-INF/pages/product/product-form.jsf")
public class ProductController extends BaseController {
	
	@Autowired
	private ProductService productService;

	private Product product = new Product();

	public void save() {
		
		productService.save(product);
		product = new Product();
		
		redirect("/product-list");

//		try {
//			FacesContext.getCurrentInstance().getExternalContext().redirect("/product-list");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

	public Product getProduct() {
		return product;
	}
}
