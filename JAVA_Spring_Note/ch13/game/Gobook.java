package ch13.game;

public class Gobook extends Character {
	
	public Gobook() {
		hp = 40;
		energy = 50;
		System.out.println("�����̰� �����Ǿ����ϴ�. ");
		printInfo();
	}
	
	@Override
	public void eat() {
		energy += 15;
	}
	@Override
	public void sleep() {
		energy += 10;
	}
	@Override
	public boolean play () {
		energy -= 30;
		hp += 15;
		levelUp();
		return checkEnergy();
	}
	@Override
	public boolean train() {
		energy -= 20;
		hp += 30;
		levelUp();
			return checkEnergy();
	}
	@Override
	public void levelUp() {
		if (50 <= hp ) {
			level++;
			hp -= 50;
		}
	}

}
