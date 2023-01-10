package chapter04;

public class ArrayTest01 {

	public static void main(String[] args) {
		//선언 방법
		int number1[] = new int[10]; // int형의 number1 배열방 10개
		int[] number2 = new int[10]; // int형의 number2 배열방 10개
		
		int number3[];
		
		number3 = new int[10];
		
		//초기화
		int number4[]=new int[] {1,2,3,4,5,6,7,8,9,10}; // Fixed-length
		int number5[]= {1,2,3,4,5,6,7,8,9,10};
		
		
		//for문
		for(int i=0; i<number3.length; i++) {
			System.out.println(number1[i]=(i+1));//리터럴 값을 대입후 출력
		}//for
		
		
		
		
	}

}
