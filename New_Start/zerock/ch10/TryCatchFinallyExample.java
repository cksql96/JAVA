package ch10;

public class TryCatchFinallyExample {
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			
			System.out.println("Try block 실행이요~ \n");
			
			//NullPointerException 예외 발생 코드를 넣으면, catch블록에서는 ClassNotFoundException만 잡는다 했으니,
			String name = null;						//얘는 그냥 예외뜨고, 프로그램 종료된다.
			System.out.println(name.length());
			
			//ClassNotFoundException 예외 발생 코드
			Class clazz = Class.forName("java.lang.String2");
			
			System.out.println("--------Done Try--------");
		} 
		catch(NullPointerException e) {
			System.out.println("catch1에 잡혔어요~");
			System.out.println("NullPointerException 발생");
		}
		catch(ClassNotFoundException e) {
			System.out.println("catch2에 잡혔어요~");
			System.out.println("ClassNotFoundException 발생"); 
		}	//end try-catch(finally block 생략)
				
		System.out.println("\n끝났어요~\n");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@두번째임@@@@@@@@@@@@@@@@@@@@@@");
		
		try {
			Class clazzz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//try - catch (finally block 생략)
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@세번째임@@@@@@@@@@@@@@@@@@@@@@");
		
		Class clazz = Class.forName("java.lang.String2");		
		
	}	//end main

}	//end class
