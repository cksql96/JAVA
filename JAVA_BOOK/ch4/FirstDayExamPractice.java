package ch4;

public class FirstDayExamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.문제 10과 20의 합과 '얀녕하세요! JAVA를 즐깁시다 출력
		int x = 10, y = 20;
		int sum = 0;
		System.out.println("10 + 20 = " + (x + y));
		System.out.println("안녕하세요! JAVA를 즐깁시다.");
		
		
		//2. 1~100까지의 합
		System.out.println();
		
		for(int i = 1; i <=100; i++)
		{
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 = " + sum);
		
		
		//3. 5칙연산 + - * / %
		System.out.println();
		int a=100, b=33;
		
		System.out.println("1. 더하기 -> a + b = " + (a + b));
		System.out.println("2. 빼   기 -> a - b = " + (a - b));
		System.out.println("3. 곱하기 -> a * b = " + (a * b));
		System.out.println("4. 나누기 -> a / b = " + (a / b));
		System.out.println("5. 나머지 -> a % b = " + (a % b));
		
	}

}
