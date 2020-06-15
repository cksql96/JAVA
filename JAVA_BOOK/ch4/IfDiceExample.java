package ch4;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random()*6) + 1;		// 0~ 5.9999999( =5) // +1을 해주면 1 ~ 6.99999(=6)
													// 0~0.9999 가 math.random임.
		if(num==1) {								//0~ 100을 해주고 싶으면, *101 해주면 댐
			System.out.println("1");
		}
		else if(num==2) {
			System.out.println("2");
		}
		else if(num==3) {
			System.out.println("3");
		}
		else if(num==4) {
			System.out.println("4");
		}
		else if(num==5) {
			System.out.println("5");
		}
		else if(num==6) {
			System.out.println("6");
		}
		else {
			System.out.println("멀라 " + num);
		}
		
	}

}
