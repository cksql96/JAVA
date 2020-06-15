package exam;

public class Second_Test_Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Q1. 구구단만들기");
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 2; j < 10; j++)
			{
				if(i == 0) 
				{
					System.out.print(j + "단 \t");
				}
				else 
				{
					System.out.print(j + "*" + i + "=" + (i*j) + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Q2. 배열 선언 및 초기화");
		
		int[] arr;							//배열 선언
		arr = new int[3];					//배열 생성
		int[] arr1 = {1,2,3};				//배열 초기화
		int[] arr2 = new int[] {1,2,3}; 	//배열 선언 및 생성 및 초기화
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q3. int 형 두개 선언 및 합 구하기");
		
		int a = 10, b = 5;
		System.out.println("a 와 b의 합은 = " + (a+b));
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q4. 1~100의 합구하기");
		
		int sum = 0;
		for(int i = 1; i < 101; i++)
		{
			sum += i;
		}
		System.out.println("1~100의 합은 = " + sum);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q5. 랜덤으로 1~20 값을 x및 y에 넣고, 그중 큰 값 구하기(심화 버전)");
		
		int x = (int)(Math.random()*20)+1, y = (int)(Math.random()*20)+1;
		int max = 0;
		
		System.out.println("x = " + x + ", y = " + y);
		if(x>y) 
		{
			max = x;
			System.out.println("그러므로 " + max + "인 x 가 더 크다!");
		}
		else if(x == y) 
		{
			System.out.println("둘의 값이 같습니다. 다시 돌리세요!");
		}
		else 
		{
			max = y;
			System.out.println("그러므로 " + max + "인 y가 더 크다!");
		}	
		
		System.out.println("----------------------------------------------------");
		System.out.println("Q5. 둘중 큰값 구하기(이지 버전)");
		
		int c = 1, d = 2;
		System.out.println("c = " + c + ", d = " + d);
		if(c > d)
		{
			max = c;
			System.out.println("c가 더 큼. c = " + max);
		}
		else if(c == d)
		{
			System.out.println("둘의 값이 같음");
		}
		else
		{
			max = d;
			System.out.println("d가 더 큼. d = " + max);
		}
		
		
	}

}
