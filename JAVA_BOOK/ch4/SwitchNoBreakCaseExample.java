package ch4;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = (int)(Math.random() * 4) + 8;
		System.out.println("현재시간 : " + time + "시");
		
		switch(time) {
			case 8 :
				System.out.println("출근 시작");
			case 9 : 
				System.out.println("회의 시작");
			case 10 : 
				System.out.println("업무 시작");
			default : 
				System.out.println("외근 시작");

		}
	}

}
