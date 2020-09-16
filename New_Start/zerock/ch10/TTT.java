package ch10;

public class TTT {
	
	
	public static void main(String[] args) {
		
		try {
			String data2 = "a100";
			int value2 = Integer.parseInt(data2);
		}
		
//		catch(NumberFormatException e){		//exception 안에, runtime exception 안에 자식
//			System.out.println("catch1 NumberFormatException에 잡혔어여~");
//			System.err.println("----------------------------");
//			System.err.println(e.getMessage());
//			System.err.println("----------------------------");
//			System.out.println("syserr에 e.getMessage를 실행했어여~");
//			e.printStackTrace();
//			System.out.println("e.printStackTrace를 실행했어여~\n그리고 catch1 끝났어여~");
//		}
		
		catch(IllegalStateException e){		//exception 안에, runtime exception 안에 자식
			;;
		} 
		
		catch(Exception e){		//Throwable 안에 있는 error, "exception" 있다. 부모는 마지막에 와야된다.
			//Exception e 에서 e는 Exception타입이 들어가고, 이것을 실행했을시!
			//만약 catch로 잡혔을시, 오류의 타입을 e에 넣는다.
			
			//instanceof 는 참조타입의 타입이 맞는지 아닌지 알려준다.
			boolean result = (e instanceof NumberFormatException);
			System.out.println(result);
			
			if(e instanceof NumberFormatException) {	//instanceof -> 변수 e가 오른쪽의 타입과 같냐?
				System.out.println("-NumberFormatException");
			} else if(e instanceof NullPointerException) {
				System.out.println("-NullPointerException");
			} else {
				System.out.println("-Others-");
			}	//end if-else-if
		} //end catch3
		
		catch(Throwable e){		//error와 exception의 최상위 부모. 그러니 맨 맨 마지막. Object는 빼고!
			e.printStackTrace();	
		}
		
		finally {
			System.out.println("끄으으읕");
		}	//end try-catch-final
		
		String a = "";
		System.out.println(a instanceof String);
		
		
		
	}	//end main

}	//end class
