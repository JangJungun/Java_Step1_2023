package chapter04;

public class ArgsTest {

	public static void main(String[] args) {
		/*int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int f = 6;
		
		System.out.println(a+b+c+d+e+f);
		*/
		//배열 선언
		int a[] = new int[5]; //Fixed-length
		
		//배열 선언2
		int b[]; //선언
		b = new int[5];
		
		int aVal;
		int bVal;
		int Tot;
		
		//배열 선언 3
		args = new String[2];
		args[0] = "1"; //[0]:첨자 / "1":요소
		args[1] = "2";
		
		String[] str;
		str = new String[10];
		
		//length : 배열의 첨자(메모리) 수
		if(args.length == 2) {
			
			aVal = Integer.parseInt(args[0]);
			bVal = Integer.parseInt(args[1]);
		}else {
			aVal = 0;
			bVal = 0;
		}//if
		
			Tot=aVal + bVal;
			System.out.println(Tot);
		
		
		
		
		
		
	}//main

}//class
