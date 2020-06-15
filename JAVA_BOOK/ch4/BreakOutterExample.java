package ch4;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Babo:for(char upper='A';upper<='Z';upper++)		//Babo처럼 아무거나 넣고 break문에 똑같이 쓰면 그 쪽이 사라진다.
		{
			/*KK:*/for(char lower='a';lower<='z';lower++)   //KK처럼 해도 댐
			{
				System.out.println(upper + "-" + lower);
				if(lower=='g') 
				{
					break Babo;
				}
				//if(lower=='d')
				//{
				//	break KK;
				//}
			}
		}
	
		System.out.println("프로그램 종료");
	
	
	}

}
      