package ch4;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 93;
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다. \n등급은 A입니다.");
		}
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");			//중괄호가 없으면 첫번째줄은 if에 포함이 되지만 나머지는 미포함. 
														//그래서 등급은 B입니다가 출력이 된다.
	}

}
