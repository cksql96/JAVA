package ch4;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String position = "";
		int a = (int)(Math.random() * 3) + 1;
		
		if(a == 1)
			{position = "����";}
		else if(a == 2)
			{position = "����";}
		else
			{position = "�Ϲ�";}
		
		
		
		switch(position) {
			case "����" :
				System.out.println("����. \n700����");
				break;
			case "����" : 
				System.out.println("����. \n500����");
				break;
			default:
				System.out.println("�Ϲ�. \n300����");
		}
	}

}
