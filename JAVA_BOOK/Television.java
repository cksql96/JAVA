package TempCh6;

public class Television {

	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
		//info = company = "-" + model;
		//이거는 info = "-" + model;
		//그리고 company = "-" + model; 
		//과 같다.!!
	}
	
}
