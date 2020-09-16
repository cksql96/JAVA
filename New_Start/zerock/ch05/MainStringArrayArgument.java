package ch05;

public class MainStringArrayArgument {
	
	
	public static void main(String[] args) {
		
		//run configuration 에 arguments에 프로그램arguments에 값을 넣으면,
		//Main 메소드에 있는 main(String[] args)에 들어가며, 그 값은 String[] args에 들어간다.
		//아무것도 안넣을시, String[] args는 빈 배열이다. null값도 아니고 그냥 원소 자체가 없다.
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			
			// 프로그램 강제종료(괄호안의 숫자는 종료코드, 0은 정상종료, 0이외의 값은 비정상 종료)
			System.exit(0);
		}	//end if
				
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		//------------------------------------------//
		// 반드시 기억. 숫자형태의 문자열을 정수로 바꿔주는 메소드
		//------------------------------------------//
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		double num3 = Double.parseDouble(strNum1);
		//------------------------------------------//
		
		String a = "13";
		int b = Integer.parseInt(a);
		System.out.println(b);
		System.out.println(num3);
		System.out.println();
		
		
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
				
	}	//end main

}	//end class
