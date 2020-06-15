package ch5;

import java.util.Scanner;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = new int[] {83,90,87};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
		System.out.println("평균 = " + (String.format("%.2f", avg)) + "입니다.");
		System.out.println();
		System.out.printf("평균 %.2f 입니다", avg);	
		System.out.println();
		
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		size = sc.nextInt();		
		
		int[] a = new int[size];
		for(int i = 0; i < a.length; i++)
		{
			int input;
			System.out.println("a[" + i + "] 안에 숫자 입력");
			input = sc.nextInt();
			a[i] = input;
		}
		for(int i =0; i< a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}

}
