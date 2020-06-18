package TempCh6;

public class DmbCellphone extends Cellphone{
	
	//필드
	int channel;
	
	//생성자
	DmbCellphone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작하빈다.");
	}
	
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
}
