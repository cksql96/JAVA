package ch01Toch04;

public class VariableScopeExample2 {
	
	
	public static void main(String[] args) {
		int v1= 15;
		
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}	//end if
		
		//int v3 = v1 + v2 + 5;		//v2변수를 사용하지 못함. if문에서 생성되고, 끝남으로서 파괴가 되었기때문에.
		
	}	//main

}	//end class
