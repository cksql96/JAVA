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
		System.out.println("���� = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
		System.out.println("��� = " + (String.format("%.2f", avg)) + "�Դϴ�.");
		System.out.println();
		System.out.printf("��� %.2f �Դϴ�", avg);	
		System.out.println();
		
		int size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�");
		size = sc.nextInt();		
		
		int[] a = new int[size];
		for(int i = 0; i < a.length; i++)
		{
			int input;
			System.out.println("a[" + i + "] �ȿ� ���� �Է�");
			input = sc.nextInt();
			a[i] = input;
		}
		for(int i =0; i< a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}

}
