package TempCh6;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DmbCellphone 객체생성
		DmbCellphone dmb = new DmbCellphone("자바폰", "검정", 10);
		
		//Cellphone으로부터 상속받은 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		//DmbCellphone의 필드
		System.out.println("채널 : " + dmb.channel);
		
		//Cellphone으로부터 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmb.sendVoice("아~예 반갑습니다.");
		dmb.hangUp();
		
		//DmbCellphone의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDMB(12);
		dmb.turnOffDmb();

	}

}
