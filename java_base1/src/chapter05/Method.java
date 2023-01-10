package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	Scanner scan = new Scanner(System.in);	
	//생성자 생략
	
	//메소드
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//method1
	
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//... 요청하신 5개의 빵을 모두 만들었습니다.
		for(int i=1; i<=count; i++) {
			System.out.println(i+"번째 빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+count+"개의 빵을 모두 만들었습니다.");
		
	}//method2
	
	void makeBread(int count, String name) {
		//1번째 생크림빵을 만들었습니다
		//2번째 생크림빵을 만들었습니다
		//... 요청하신 5개의 생크림빵을 모두 만들었습니다.
		System.out.println("1. 빵 개수 선택 | 2. 빵의 개수와 종류 | 3. 종료");
		System.out.print("선택>");
		count = scan.nextInt();
		for(int i=1; i<=count; i++) {
			System.out.println(i+"번째 "+name+"빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+count+"개의 "+name+"빵을 모두 만들었습니다.");
		
	}//method3
	
	void order() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 빵 개수 선택 | 2. 빵의 개수와 종류 | 3. 종료");
			System.out.print("선택>");
			int num = scan.nextInt();
			if(num==1) {
				System.out.print("주문할 빵의 개수: ");
				int count = scan.nextInt();
				for(int i=1; i<=count; i++) {//makeBread(count) 하는것이 깔끔
					System.out.println(i+"번째 빵을 만들었습니다.");
				}
				System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
			}else if(num==2) {
				System.out.print("주문할 빵의 개수: ");
				int count = scan.nextInt();
				System.out.println("주문할 빵의 종류: ");
				System.out.println("(크림, 초코, 팥 중에서 골라주세요)");
				String name = scan.next();
				
				for(int i=1; i<=count; i++) {
					System.out.println(i+"번째 "+name+"빵을 만들었습니다.");
				}
				System.out.println("요청하신 "+count+"개의 "+name+"빵이 모두 완료되었습니다.");
			}else if(num==3) {
				break;
			}else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
				continue;
			}//if
			
		}//while
		System.out.println("프로그램 종료");
		
	}//order method
	
	
}
