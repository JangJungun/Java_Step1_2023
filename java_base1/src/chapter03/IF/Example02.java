package chapter03.IF;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// gender가 M이면 남성입니다 그렇지 않으면 여성입니다.
		// Scanner로 char 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요(M/F): ");
		char gender = scan.nextLine().charAt(0);
		
		if(gender == 'M') {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		System.out.println("----------------------------");
		System.out.println();
		System.out.print("주문하시겠습니까?(Y,N)");
		
		char ch = scan.nextLine().charAt(0);
		
		//조건에 논리함수 사용
		if(ch =='Y' || ch =='y') {
			System.out.println("메뉴를 입력하세요 : ");
			String food = scan.nextLine();
			System.out.println(food+"(가)이 주문되었습니다.");
		}else {
			System.out.println("이용해 주셔서 감사합니다.");
		}
		
		
		
	}

}
