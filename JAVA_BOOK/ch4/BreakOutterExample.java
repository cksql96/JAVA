package ch4;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Babo:for(char upper='A';upper<='Z';upper++)		//Baboó�� �ƹ��ų� �ְ� break���� �Ȱ��� ���� �� ���� �������.
		{
			/*KK:*/for(char lower='a';lower<='z';lower++)   //KKó�� �ص� ��
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
	
		System.out.println("���α׷� ����");
	
	
	}

}
      