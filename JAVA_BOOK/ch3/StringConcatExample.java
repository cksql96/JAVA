package ch3;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		System.out.println();
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		String a = "JDK" + 3 + 2.0 + 5;
		System.out.println(a+"\n");
		String b = 3 + 2.0 + 5 + "JDK";
		System.out.println(b+"\n");
		String c = "JDK" + 3 + 2.0 + 5 * 2;
		System.out.println(c+
				"\n");
		
		String d = "a" +3 + 2;
		System.out.println(d);
		String e = "3 + 2" ;
		System.out.println(e);
		//String f = 3+2; // 컴파일 에러
		
		String f = "a" + 3 + 2 * 3 / 4.0;
		System.out.println(f);
		String g = "a" + 3 + 2*3 / 4;
		System.out.println(g);
		
	}

}
