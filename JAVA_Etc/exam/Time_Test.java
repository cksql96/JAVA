package exam;
import java.util.*;
public class Time_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int second = 0;
		int ResultHour = 0, ResultMinute = 0, ResultSecond = 0;
		System.out.println("초 단위 정수를 입력하세요 : ");
		second = sc.nextInt();

		ResultHour = second / 3600;
		ResultMinute = (second / 60) - (ResultHour * 60);
		ResultSecond = second - (ResultHour * 3600 ) - (ResultMinute * 60);	
		
		System.out.println(ResultHour + "시간 " + ResultMinute +"분 " + ResultSecond + "초");
		
		
	}

}
