package chapter03.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//run에다가 false넣고 브레이크
		int sum=0;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			int num1 = scan.nextInt();
			
			if(num1==1) { //0이하의 금액이 입력되었을때 예외처리
				System.out.print("예금액> ");
				int in = scan.nextInt();
				if(in<0) {
					System.out.println("예금액을 다시 입력하십시오.");
					continue;
				}else {
					sum += in; 
				}
			}else if(num1==2) {
				System.out.println("출금액> ");
				int out = scan.nextInt();
				if(sum<out) { //잔액이 부족합니다.
					System.out.println("잔액이 부족합니다.");
					continue;
				}else {
					sum -= out; 
				}
			}else if(num1==3) {
				System.out.println("잔고> ");
				System.out.println(sum);
			}else if(num1==4) {
				run=false;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}//if
			

			
		}//while
		System.out.println("프로그램 종료");
		
		
	}

}
