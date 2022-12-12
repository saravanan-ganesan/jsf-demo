package com.jsf.samples.bootfaces.controller;

import java.time.ZonedDateTime;
import java.util.Calendar;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;

import com.jsf.samples.bootfaces.dto.TimeZone;

@Component (value = "timezoneController")
@ELBeanName(value = "timezoneController")
@Join(path = "/timezone", to = "/WEB-INF/pages/jsp/timezone.jsf")
public class TimeZoneController extends BaseController {

	private TimeZone timezone;
	
	public TimeZone getTimezone() {
		
		timezone = new TimeZone();
		
		Calendar now = Calendar.getInstance();
		java.util.TimeZone systemTimeZone = now.getTimeZone();
		
		timezone.setCurrentTimeZone(systemTimeZone.getDisplayName());
		ZonedDateTime zoneNow = ZonedDateTime.now(java.util.TimeZone.getTimeZone(systemTimeZone.getDisplayName()).toZoneId());
		timezone.setCurrentTime(zoneNow.toString());
		
		return timezone;
	}

}
