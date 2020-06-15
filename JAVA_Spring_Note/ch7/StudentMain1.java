package ch7;

public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.name = "±èÅÂÈñ";
		s1.kor = 90;
		s1.eng = 95;
		s1.math = 100;
		/*
		 * s1.sum = s1.kor + s1.eng + s1.math; s1.avg = (float) s1.sum / 3;
		 */
		
		/*
		 * System.out.println("°´Ã¼ s1ÀÇ Á¤º¸"); System.out.println("Name : " +s1.name);
		 * System.out.println("Korean : " + s1.kor); System.out.println("English : " +
		 * s1.eng); System.out.println("Math : " + s1.math);
		 * System.out.println("Total : " + s1.sum); System.out.println("Average : " +
		 * s1.avg + "\n");
		 */
		
		s2.name = "¿øºó";
		s2.kor =80;
		s2.eng = 90;
		s2.math = 70;
		/*
		 * s2.sum = s2.kor + s2.eng + s2.math; s2.avg = (float) s2.sum / 3;
		 */
		
		/*
		 * System.out.println("°´Ã¼ s2ÀÇ Á¤º¸"); System.out.println("Name : " +s2.name);
		 * System.out.println("Korean : " + s2.kor); System.out.println("English : " +
		 * s2.eng); System.out.println("Math : " + s2.math);
		 * System.out.println("Total : " + s2.sum); System.out.println("Average : " +
		 * s2.avg + "\n");
		 */
		s3.name = "±èÀ¯Á¤";
		s3.kor =100;
		s3.eng = 100;
		s3.math = 100;
		/*
		 * s3.sum = s3.kor + s3.eng + s3.math; s3.avg = (float) s3.sum / 3;
		 */
		
		/*
		 * System.out.println("°´Ã¼ s3ÀÇ Á¤º¸"); System.out.println("Name : " +s3.name);
		 * System.out.println("Korean : " + s3.kor); System.out.println("English : " +
		 * s3.eng); System.out.println("Math : " + s3.math);
		 * System.out.println("Total : " + s3.sum); System.out.println("Average : " +
		 * s3.avg + "\n");
		 */
		
		s4.name = "ÃÖÀ¯Á¤";
		s4.kor =70;
		s4.eng = 60;
		s4.math = 80;
		/*
		 * s4.sum = s4.kor + s4.eng + s4.math; s4.avg = (float) s4.sum / 3;
		 */
		
		s5.name = "¹Úº¸¿µ";
		s5.kor =90;
		s5.eng = 80;
		s5.math = 90;
		/*
		 * s3.sum = s3.kor + s3.eng + s3.math; s3.avg = (float) s3.sum / 3;
		 */
		
		s1.eval_sum();
		s1.eval_avg();
		s1.print();
		
		s2.eval_sum();
		s2.eval_avg();
		s2.print();
		
		s3.eval_sum();
		s3.eval_avg();
		s3.print();
		
		s4.eval_sum();
		s4.eval_avg();
		s4.print();
		
		s5.eval_sum();
		s5.eval_avg();
		s5.print();

	}

}
