package ch10;

public class TTT4 {
	
	
	public static void main(String[] args)  {
		
		try {
			method1();
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}	//end main
	
	public static void method1() throws Exception  {
		System.out.println("-Method1입니다.");
		System.out.println("이제 Method2불러올게요\n");
		method2();
	}	//end method1
	
	public static void method2() throws Exception {
		System.out.println("-Method2입니다.");
		System.out.println("이제 Method3불러올게요\n");
		method3();
	}	//end method2
	
	public static void method3() throws Exception {
		System.out.println("-Method3입니다.");
		System.out.println("Method3에서 예외 만들어볼게요. \n");
		
		throw new Exception ("Method3에서 만들어진 예외에요!");
		//checked exception 일 경우, Throws ???를 붙여줘야한다.
		
		//throw new NullPointerException("ㅁㄴㅇㄹ");
		//이경우에는 Throws를 안붙여도 되지만 어쨋든 오류가 나긴 한다.
		
//		try {
//			throw new NullPointerException("Method3에서 만들어진 예외에요!");
//		}catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
		
	}	//end method3

}	//end class
