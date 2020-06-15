package ch4;
import java.util.*;

public class ElseIf {
	//private static Scanner sc = new Scanner(System.in);                      // 10라인 참고
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		
		//5라인처럼 private static 으로 싹다 넣으면 노란줄 사라짐.
		Scanner sc = new Scanner(System.in);			//new는 메모리 할당// sc는 객체 
		System.out.println("점수 입력");
		jumsu = sc.nextInt();		//키보드로 정수형 입력 	// .은 멤버접근 연산자(요소지정연산자) // sc는 객체
		if(jumsu>=90) {
			System.out.println("A");
		}
		else if(jumsu>=80) {
			System.out.println("B");
		}
		else if(jumsu>=70) {
			System.out.println("C");
		}
		else if(jumsu>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
