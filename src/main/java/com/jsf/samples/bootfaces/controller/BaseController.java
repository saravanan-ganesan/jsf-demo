package com.jsf.samples.bootfaces.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;

@Scope(value = "request")
public class BaseController {

	public void home() {
		
		redirect("/product-list");

	}
	
	public void redirect(String page) {
		
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect(page);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
