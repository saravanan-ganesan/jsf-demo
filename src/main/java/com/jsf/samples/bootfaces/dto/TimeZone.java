package com.jsf.samples.bootfaces.dto;

import lombok.Data;

@Data
public class TimeZone {

	private String currentTimeZone;
	
	private String currentTime;
	
	public TimeZone() {}
}
