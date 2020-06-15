package ch5;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
		
		////////////////////////////////////////////////////////
		System.out.println();
		for(int i = 0; i < newStrArray.length; i++) {
			newStrArray[i] = "a";				// Array를 "" 해줘도 되는데 빈칸을 알아보기쉽게  a를 넣음
		}
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
		
		////////////////////////////////////////////////////////
		System.out.println();
		for(int i = 0; i < newStrArray.length; i++) {
			newStrArray[i] = "a";
		}
		
		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
		
		////////////////////////////////////////////////////////
		System.out.println();
		for(int i = 0; i < newStrArray.length; i++) {
			newStrArray[i] = null;
		}
		
		System.arraycopy(oldStrArray, 1, newStrArray, 1, 2);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
				
	}

}
