package ch7;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	
	
	void eval_sum() {
		sum = kor + eng + math;
	}
	
	void eval_avg() {
		avg = (float) sum / 3;
	}
	
	void print() {
		System.out.println("Name : " + name);
		System.out.println("Korean : " + kor);
		System.out.println("English : " + eng);
		System.out.println("Manth : " + math);
		System.out.println("Total : " + sum);
		System.out.println("Average : " + avg+ "\n");
	}
	
}
