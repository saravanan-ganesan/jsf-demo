package com.jsf.samples.bootfaces.dto;

import lombok.Data;

@Data
public class CurrentDateTime {

	private String currentDate;
	private String currentTime;
	
	public CurrentDateTime() {}
}
