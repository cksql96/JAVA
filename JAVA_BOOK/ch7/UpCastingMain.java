package TempCh7;

public class UpCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("UpCastingParent�� ��ü");
		UpCastingParent up = new UpCastingParent();
		System.out.println("up.add() = " + up.add() + "\n");
		
		System.out.println("UpCastingChild�� ��ü");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add() = " + uc.add());
		System.out.println("uc.sub() = " + uc.sub() + "\n");
		
		System.out.println("UpCasting�� ��ü");
		UpCastingParent upc = new UpCastingChild();
		//��ĳ���� ��ü�� ����, Ÿ���� �θ�Ŭ������ UpCastingParent�̰�,
		//������ ȣ���� �ڽ�Ŭ������ UpCastingChild�� ���� ȣ���Ѵ�.
		System.out.println("upc.add() = " + upc.add() + "\n");
		//add�� ȣ���ϸ� �����ǵ� �޼��尡 ȣ��Ǿ� x + y + z�� ����� ��ȯ
		
		//System.out.println("upc.sub() + " + upc.sub());
		//sub()�� ȣ���ϴµ�, upc�� Ÿ���� upCastingParent�̹Ƿ�
		//�� Ŭ�������� sub()�� ���ǵ��� ����. �׷��� ������ �߻�.
		//��ó�� Ÿ���� �θ�, ����Ǵ� ���´� �ڽ��� ���� ��ĳ�����̶�� �Ѵ�.
		
		
		
	}

}
