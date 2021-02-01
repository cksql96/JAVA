package HackerRank.InterviewPreparation.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Sorting_Comparator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Player[] player = new Player[n];
		Checker checker = new Checker();
		
		for(int i = 0; i < n; i++) {
			player[i] = new Player(sc.next(), sc.nextInt());
		}	//for
		
		sc.close();
		
		Arrays.sort(player, checker);		//player라는 타입의 배열을 checker에 따라 sorting한다.
		
		for(int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}	//for
		
		
	}	//end main

}	//end class(Comparator)

@AllArgsConstructor
class Player{
	String name;
	int score;		
}	//end class(Player)


@NoArgsConstructor
class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
//		System.out.println("Compare invoked...");
//		
//		System.out.println("\t\t++o1: " + o1.name + o1.score);
//		System.out.println("\t\t++o2: " + o2.name + o2.score);
		
		if(o1.score == o2.score ) {
//			System.out.println("\t++if문: " + o1.name.compareTo(o2.name));
			
			return o1.name.compareTo(o2.name);
		} else {
//			System.out.println("\t++else문: " + Integer.compare(o2.score, o1.score));
			
			return Integer.compare(o2.score, o1.score);
		}	//if-else
		
	}	//compare
	
}	//end class(Checker)


