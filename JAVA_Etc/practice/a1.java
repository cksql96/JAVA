package practice;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A';			//문자를 직접 저장
		char c2 = 65;			//10진수로 저장
		char c3 = '\u0041';		//16진수로 저장
		
		int a = c1;				//유니코드를 숫자로 얻기
		int b = 96;	
		char c4 = (char)b;		//숫자를 유니코드로
		
		
		/*
		 * int var1 = 10; 
		 * int var2 = 012; 
		 * int var3 = 0xA;
		 * 
		 * System.out.println(var1); System.out.println(var2); System.out.println(var3);
		 * 
		 * int var5 = 40; char a = (char)var5;
		 * 
		 * System.out.println(a);
		 */
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("C1  = " + c1);
		System.out.println("C2  = " + c2);
		System.out.println("C3  = " + c3);		//char로 넣을때 문자로 넣든 10진수로 넣든 16진수로 넣든 문자 A가 생성된다.
		
		System.out.println("Char C1 을 Int a 값으로 치환했을때 = " + a);
		//문자말고 숫자로 알고싶으면 int로 된 변수를 선언해서 만들어준다.
		System.out.println("Int b를 Char c4 값으로 치환 했을때 = " + c4);
		//숫자를 유니코드로 알고싶으면 char로 된 변수를 선언해서 만들어준다.
	}

}
