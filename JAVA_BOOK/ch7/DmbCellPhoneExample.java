package TempCh6;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DmbCellphone ��ü����
		DmbCellphone dmb = new DmbCellphone("�ڹ���", "����", 10);
		
		//Cellphone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmb.model);
		System.out.println("���� : " + dmb.color);
		
		//DmbCellphone�� �ʵ�
		System.out.println("ä�� : " + dmb.channel);
		
		//Cellphone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmb.sendVoice("��~�� �ݰ����ϴ�.");
		dmb.hangUp();
		
		//DmbCellphone�� �޼ҵ� ȣ��
		dmb.turnOnDmb();
		dmb.changeChannelDMB(12);
		dmb.turnOffDmb();

	}

}
