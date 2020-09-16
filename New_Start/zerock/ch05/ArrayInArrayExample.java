package ch05;

public class ArrayInArrayExample {
	
	
	public static void main(String[] args) {
		//기본타입별로 초기값을 컴파일러가 할당 : int -> 0으로 원소의 값 초기화
		int [][] mathScores = new int[2][3];
		
		//1차원 배열의 순회(traverse)
		for(int i = 0; i<mathScores.length; i++) {
			
			//2차원 배열의 순회(traverse)
			for(int k = 0; k <mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
				
			}	//end 2nd for, inner for
			
			System.out.println();
		}	//end 1st for, outer for
		
		System.out.println("----------------------------");
		int[][] englishScores = new int[2][];
		
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i = 0; i < englishScores.length; i++) {
			
			for(int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
				
			}	//end 2nd for, inner for
			
			System.out.println();
		}	//end 1st for, outer for
		
		System.out.println("------------------------------");
		String[][] javaScores = { {"1반 바보", "1반 멍청이"}, {"2반 해삼", "2반 멍게", "2반 말미잘"} };
		
		for(int i = 0; i <javaScores.length; i++) {
			
			for(int k = 0; k <javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
				
			}	//end 2nd for, inner for
			
			System.out.println();
		}	//end 1st for, outer for
		
		
	}	//end main

}	//end class
