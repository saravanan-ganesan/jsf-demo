package com.jsf.samples.bootfaces.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component (value = "loginController")
@ELBeanName(value = "loginController")
@Join(path = "/", to = "/WEB-INF/pages/product/product-list.jsf")
public class LoginController extends BaseController {
    
    public void logout(){
    	
        SecurityContextHolder.clearContext();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/");
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}
