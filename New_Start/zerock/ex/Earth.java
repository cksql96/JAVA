package com.zerock.ex;

public class Earth {
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI 
				* EARTH_RADIUS * EARTH_RADIUS;
	}	//static finalizer
	
	//생성자 - 인스턴스 필드의 초기화
}	//end class
