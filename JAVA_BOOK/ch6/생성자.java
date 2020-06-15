package ch6;

public class 생성자 {

	
	//System.out.println("바보");			//출력문은 그냥 쓸수 없으므로, {} 안에 넣어주면 쓸수있다.
											//단 Main에서 새로운 메모리를 할당해주면 따로 명령하지 않아도 출력이 된다.
	
	//Main에서 새로운 메모리를 할당해주면 저 순서대로 실행이 된다.
	
	생성자() {										//4등
		System.out.println("멍게");
		System.out.println(y);
	}
	
	
	int y = 1;
	static int x = 10;								//1등
	
	static {										//2등
		System.out.println("해삼");
		System.out.println(x);	
	}
	
	
	
	{												//3등
	System.out.println("멍청이");	
	}
	
	
	
	
	
	
	
}
