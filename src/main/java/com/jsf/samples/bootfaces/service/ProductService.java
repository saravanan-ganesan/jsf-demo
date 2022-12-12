package com.jsf.samples.bootfaces.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsf.samples.bootfaces.entity.Product;

@Service
public interface ProductService {

	public List<Product> getAll();
	
	public void save(Product product);
	
	public void delete(Product product);
}
