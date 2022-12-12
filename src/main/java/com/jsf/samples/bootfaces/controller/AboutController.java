package com.jsf.samples.bootfaces.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;

@Component(value = "aboutController")
@ELBeanName(value = "aboutController")
@Join(path = "/about", to = "/WEB-INF/pages/about/about.jsf")
public class AboutController extends BaseController {
	
	

}
