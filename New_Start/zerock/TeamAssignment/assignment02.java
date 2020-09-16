package TeamAssignment;

public class assignment02 {
	
	public static void main(String[] args) {
		/* 한 한생의 점수가 78점으로 주어졌다.
		 * 이때 아래의 점수대에 따라, 등급을 부여하십시오.
		 * 100~90 	: A
		 * 80~89	: B
		 * 70~79	: C
		 * 그 외 		: D
		 * 
		 * 조건 : 삼항 연산자로만 해결하시오!. 
		 */
		
		int score = 78;
		
		char grade = 
				(score>=90) ? 'A' :
					(score>=80) ? 'B' :
						(score >=70) ? 'C' : 'D';
		
		System.out.println("점수는 " + score + "이며, 등급은 "
							+ grade +"입니다.");
		
	}	//end main

}	//end class
