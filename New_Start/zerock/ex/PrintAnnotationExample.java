package com.zerock.ex;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	
	public static void main(String[] args) {
		
		//1. Service 클래스로부터 메소드 정보를 얻음.
		//	1)Service.class의 Clazz객체 획득
		
		//총 4개가 저장됨.
		Method[] declaredMethods = 
				Service.class.getDeclaredMethods();
		
		
		//-------------------------------------------//
		
		//2. Method 객체를 하나씩 처리 
		//모든 메소드 다 소환 -> 4.
		for(Method method : declaredMethods) {
			
			//-----3. PrintAnnotation이 적용되었는지 확인
			//어노테이션이 적용되어있는 3개.
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				
				//-----4. PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = 
						method.getAnnotation(PrintAnnotation.class);
				
				//-----5.메소드 이름 출력
				System.out.println("[" + method.getName() + "] " );
				
				//-----6. 구분선 출력
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}	//for
				
				System.out.println();
				
				double start = 0.0, end = 0.0;
				try {
					//메소드 호출
					start = System.nanoTime();
					method.invoke(new Service());
					end = System.nanoTime();
				}catch(Exception e) {;;} //try -catch
				finally {
					System.out.println("시작 : " + start + ", 끝: " + end);
					System.out.println("걸린시간 : " + (end-start)+"ns");
				}
			}	//	if
			System.out.println();
			
		}	//	enhanced for

	}	//end main
	
}	//end class
