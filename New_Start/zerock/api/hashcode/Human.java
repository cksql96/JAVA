package com.zerock.api.hashcode;

public class Human {
	
	private String tel = "01027626644";
	
	@Override
	public int hashCode() {
		return Integer.parseInt(tel);
	}
	
}	//end class
