package ch5;

public class Max_Min_BubbleSort 
{
	public static void main(String[] args) 
	{
		int [] arr = {2, 5, -1, 3, 13, 15, 8, 30,1, 9, 11};
		int max = arr[0], min = arr[0];
		
		for(int i = 0; i < arr.length; i++) 
		{
			if(max < arr[i]) 
			{
				max = arr[i];
			}
			if(min > arr[i]) 
			{
				min = arr[i];
			}
		}
		
		System.out.println("max = " +max);
		System.out.println("min = " +min);
		System.out.println();
		
		System.out.println("정렬전");
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//////////////////////////////////////////////////////////////
		//bubble sort 오름차순
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = i + 1; j < arr.length/* -i*/ -1; j++) 
			{
				if(arr[i] > arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("오름차순 정렬후");
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		/////////////////////////////////////////////////////////////
		//bubble sort 내림차순 
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i +1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("내림차순 정렬후");
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
