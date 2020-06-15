package ch3;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int charCode = 'A';
		if ((charCode >=65) & (charCode<=90)) {
			System.out.println("대문자");
		}
		
		if ((charCode >=97) && (charCode<=122)) {
			System.out.println("소문자");
		}
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9숫자");
		}
		int value = 6;
		
		if((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2나 3의 배수");
		}
		if ((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2나 3의 배수");
		}
		
		// & 와 &&의 차이는 &는 두개의 수를 다 확인하는 반면에 &&는 앞에것이 false일 경우 뒤에꺼는 보지않고 false를 정의하여
		// 더 효율적이다.
		// | 와 ||의 차이도 &와 같다. |는 둘다 확인하고 ||는 앞에것이 ture일경우 뒤에꺼를 보지않고 true를 정의한다.
			
	}

}
