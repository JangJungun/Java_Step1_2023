package chapter03.While;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		String menu = "";
		
		while(true) {
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n작업할 번호를 선택해주세요 : ");
			num=scan.nextInt();
			
			switch (num) {
			case 1: 
				System.out.println("입력하기를 선택하셨습니다.");
			case 2:
				System.out.println("출력하기를 선택하셨습니다.");
			case 3:
				System.out.println("삭제하기를 선택하셨습니다.");
			case 4:
				System.out.println("끝내기를 선택하셨습니다.");
				break;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
			}//switch
			//while의 종료 구현
			if(num==4) {
				break;
			}
			System.out.println();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
