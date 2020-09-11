package com.zerock.api.deepcopy;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Member implements Cloneable{
	
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	
	//메소드 제정의. 
	//이유: 깊은 복제는 단순 clone() 메소드 호출로는 안됨(얕은 복제만 수행)
	//때문에, 직접 개발자가 깊은 복제가 가능하도록 재구현함
	@Override
	protected Object clone() 
			throws CloneNotSupportedException {
		//1. 먼저 얕은 복사를 해서 age와 car 를 복제한다.
		Member cloned = (Member) super.clone();
		//2. scores를 복제한다.
		cloned.scores = 
				Arrays.copyOf(
						this.scores, 
						this.scores.length);
		//3. car를 복제한다.
		cloned.car = new Car(this.car.model);
		//4. deep copy가 된 Member 객체를 리턴.
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {	
			//복제 시작.
			//clone을 재 정의하여, 모든것에 
			//새 reference가 나온다.
			cloned = (Member) clone();
		} catch( CloneNotSupportedException e) {
			
			e.printStackTrace();
		}	//try - catch
		
		return cloned;
		
	}	//getMember

}	//end class
