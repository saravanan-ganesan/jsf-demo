package com.jsf.samples.bootfaces.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;

import com.jsf.samples.bootfaces.dto.CurrentDateTime;

@Component(value = "datetimeController")
@ELBeanName(value = "datetimeController")
@Join(path = "/datetime", to = "/WEB-INF/pages/jsp/datetime.jsf")
public class DateTimeController extends BaseController {

	private CurrentDateTime currentDateTime;
	
	public CurrentDateTime getCurrentDateTime() {
		
		currentDateTime = new CurrentDateTime();
		
		currentDateTime.setCurrentDate(LocalDate.now().toString());
		currentDateTime.setCurrentTime(LocalTime.now().toString());
		
		return currentDateTime;
	}
	
}
