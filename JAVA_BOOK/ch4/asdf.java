package ch4;
import java.util.*;

public class asdf {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		System.out.println(arr.length);
		//////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		/////////////////////////////////////////
		System.out.println();
		int ar[] = new int[3];
		System.out.println(ar.length);
		///////////////////////////////////////
		System.out.println();
		for(int i = 0; i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		///////////////////////////////////////////////
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		String a[] = new String[3];
		for(int i = 0; i<a.length; i++)
		{
			System.out.println("�Է�");
			a[i] = sc.nextLine();
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i] + "\n");
		}
		
	}

}
