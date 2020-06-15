package ch13.game;
import java.util.Scanner;

public class GameMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Character character = null;
		PlayGame pg = null;
		System.out.println(" ���ϴ� ĳ���͸� �����Ͻÿ�. \n 1.��ī��\t2.������\t3.�̻��ؾ�");
		
		int x = sc.nextInt();
		switch (x) {
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			character = new Lee();
			break;
		default:
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		if(character == null) {
			System.out.println("������ �����մϴ�.");
			return;
		}
		else {
			pg = new PlayGame(character);
		}
		while(true) {
			pg.printMenu(sc);;
			
			if (pg.isExit()) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
	}
}