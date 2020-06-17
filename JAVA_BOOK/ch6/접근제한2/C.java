package TempCh6.접근제한2;
import TempCh6.접근제한1.A;

public class C {

	//필드
	A a1 = new A(true);
	//A a2 = new A(1);			//에러 default -> 패키지가 다름
	//A a3 = new A("문자열");		//에러 private
	
}
