package com.jsf.samples.bootfaces;

import java.util.EnumSet;

import javax.faces.webapp.FacesServlet;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;

import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"com.jsf.samples.bootfaces"})
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
		
		FacesServlet servlet = new FacesServlet();
		return new ServletRegistrationBean<FacesServlet>(servlet, "*.jsf");
	}
	
	@Bean
	public FilterRegistrationBean<Filter> rewriteFilter() {
		
		FilterRegistrationBean<Filter> rwFilter = new FilterRegistrationBean<Filter>(new RewriteFilter());
		EnumSet<DispatcherType> enumSet = EnumSet.of(DispatcherType.FORWARD, 
										DispatcherType.REQUEST,
										DispatcherType.ASYNC, 
										DispatcherType.ERROR);
		rwFilter.setDispatcherTypes(enumSet);
		rwFilter.addUrlPatterns("/*");
		return rwFilter;
		
	}
}
