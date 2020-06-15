package ch4;

public class For6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		for(i=0;i<10;i++) {									//	°ö¼À 	¼ö 
			for(j=2;j<10;j++) {								//	´Ü	¼ö
				if(i==0) {
					System.out.print(j + "´Ü\t");
				}
				else {
					System.out.print(j+"*"+i+"=" +(j*i+"\t"));
				}
			}
			System.out.println();
		}
	}

}
