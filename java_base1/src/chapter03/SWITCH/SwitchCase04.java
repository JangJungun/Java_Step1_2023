package chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스변수 scan에 값을 입력받음
		//A,a -> 우수고객 / B,b -> 일반회원 / 나머지 -> 고객
		Scanner scan = new Scanner(System.in);
		System.out.print("등급을 입력하세요(A,B,C) : ");
		
		char grade;
		
		grade=scan.nextLine().charAt(0);
		
		//switch로 판단
		switch (grade) {
		case 'A','a':
			System.out.println("우수고객 입니다.");
			break;
		case 'B': case'b':
			System.out.println("일반회원 입니다.");
			break;
		default:
			System.out.println("고객님 환영합니다.");
			
		}//switch
		
	}//main

}//class
