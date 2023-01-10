package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오
		
		Scanner scan = new Scanner(System.in);
		
		int a, cnt3=0, cnt5=0;
		System.out.println("정수 10개를 입력하세요: ");
		
		for(int i=1; i<=10; i++) {
			a = scan.nextInt();
			if(a==0) {
				continue;
			}
			else if(a%3 == 0) {
				cnt3++;
			}
			else if(a%5 == 0) {
				cnt5++;
			}//if
			
		}//for
		System.out.println("3의 배수는 "+cnt3+"개 이고, 5의 배수는 "+cnt5+"개 입니다.");
		
		
	}//main

}//class
