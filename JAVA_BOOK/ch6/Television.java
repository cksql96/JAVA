package TempCh6;

public class Television {

	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
		//info = company = "-" + model;
		//�̰Ŵ� info = "-" + model;
		//�׸��� company = "-" + model; 
		//�� ����.!!
	}
	
}
