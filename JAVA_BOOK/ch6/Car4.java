package ch6;

public class Car4 {

	//�ʵ�
	int gas =0;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("no Gas~!!");
			return false;
		}
		System.out.println("have Gas~!!");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("run. (remain Gas : " + gas + ")" );
				gas -=1;
			}else {
				System.out.println("Stop. (remain Gas : " + gas + ")");
				return;
			}
		}
	}
	
}
