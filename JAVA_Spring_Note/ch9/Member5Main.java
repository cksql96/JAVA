package ch9;

public class Member5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member5 m = new Member5();
		m.print();
		
		
		// member5를 부를때 맨 위에있는 생성자를 호출. 하지만 그 생성자에 this가 있어서 그 this에서 호출된 하나의 파라메터를 
		// 생성자들 사이에서 찾음. 이후 하나의 파라메터를 갖고있는 생성자를 찾았으나 또 다른 this가 있고 그 this는 세개의 파라메터를 찾음
		// 그리하여 세개의 파라메터를 찾고 이후 그 안에서 파라메터들에게 입력을 하고 모든 일을 수행했으므로 그 생성자를 호출한 전의 생성자를 찾아가
		// 그 생성자 안에있는 다른 일들을 마저 끝냄. 끝내고 그 생성자를 호출한 다른 생성자로 돌아가서 마저 수행함.
	}

}
