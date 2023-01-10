package chapter06;

import java.util.Random;
import java.util.Scanner;


public class BaseballGame {

	
	Scanner scan = new Scanner(System.in);
	private String check;
	
	public BaseballGame() {
		
		
	}
	
	public String check() {
		int com1=0;
		int com2=0;
		int com3=0;
		
		do {
			//1에서 9사이의 난수
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		} while(com1==com2 || com1==com3 || com2==com3);
		int user1=0;
		int user2=0;
		int user3=0;
		
		while(true) {
			System.out.println("--1~9 사이의 수를 입력하세요--");
			System.out.print("첫번째 수를 입력하세요: ");
			user1 = scan.nextInt();//사용자가 준비한 수
			System.out.print("두번째 수를 입력하세요: ");
			user2 = scan.nextInt();//사용자가 준비한 수
			System.out.print("세번째 수를 입력하세요: ");
			user3 = scan.nextInt();//사용자가 준비한 수
			
			int strike=0;
			int ball=0;
			
			if(user1==com1) {//숫자와 자리까지 모두 같은 경우
				System.out.println("스트라이크!");
				strike++;
			}else if(user1==com2||user1==com3) {//숫자만 맞을 경우
				System.out.println("볼");
				ball++;
			}
			//---------------------------------
			if(user2==com2) {//숫자와 자리까지 모두 같은 경우
				System.out.println("스트라이크!");
				strike++;
			}else if(user2==com1||user2==com3) {//숫자만 맞을 경우
				System.out.println("볼");
				ball++;
			}
			//---------------------------------
			if(user3==com3) {//숫자와 자리까지 모두 같은 경우
				System.out.println("스트라이크!");
				strike++;
			}else if(user3==com2||user3==com1) {//숫자만 맞을 경우
				System.out.println("볼");
				ball++;
			}
			//---------------------------------
			if(strike == 3) {
				System.out.println("WIN");
				this.check = "WIN";
				break;
			}else {
				if(strike>0 || ball>0) {
					System.out.println(strike+" Strike, "+ball+" Ball");
				}else {//아무것도 일치하는 것이 없을 경우
					System.out.println("OUT");
					System.out.println("=========================");
				}// in if
			}//out if
			
			
			
			
	
			
			
		}
		return check;
	}
	
	
}


