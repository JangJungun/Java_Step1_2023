package chapter05;

import java.util.Scanner;

public class Method2 {
	int cnt, num;
	boolean run = true;
	String str="";
	Method br=new Method();
	
	Scanner scan = new Scanner(System.in);
	
	public Method2() {
		
	}
	
	void order2() {
	
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			
			num=scan.nextInt();
			
			switch (num) {
			case 1 :
				br.makeBread(cnt);
				break;
			case 2 : 
				System.out.print("주문할 빵의 개수: ");
				int cnt2 = scan.nextInt();
				System.out.println("주문할 빵의 종류: ");
				System.out.println("(크림, 초코, 팥 중에서 골라주세요)");
				String name = scan.next();
				br.makeBread(cnt2, name);
			default:
				System.out.println("잘못된 번호 입니다.");
			}//switch
		
		}//while
		
	}//main
	
}//class
