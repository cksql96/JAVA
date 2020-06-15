package ch4;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String position = "";
		int a = (int)(Math.random() * 3) + 1;
		
		if(a == 1)
			{position = "부장";}
		else if(a == 2)
			{position = "과장";}
		else
			{position = "일반";}
		
		
		
		switch(position) {
			case "부장" :
				System.out.println("부장. \n700만원");
				break;
			case "과장" : 
				System.out.println("과장. \n500만원");
				break;
			default:
				System.out.println("일반. \n300만원");
		}
	}

}
