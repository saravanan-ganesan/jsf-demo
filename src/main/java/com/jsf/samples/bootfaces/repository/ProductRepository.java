package com.jsf.samples.bootfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsf.samples.bootfaces.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
