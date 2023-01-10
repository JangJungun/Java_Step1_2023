package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		
		String id = "soldesk";
		int pw = 221227;
		
		// Scanner scan이라는 인스턴스 변수 선언
		Scanner scan = new Scanner(System.in);
		
		//ID라는 변수로 아이디 받기
		System.out.println("아이디를 입력하세요.");
		String ID = scan.nextLine();
		
		//PW라는 변수로 비번받기(String) => 숫자로 받되 String
		System.out.println("비밀번호를 입력하세요.");
		String PW = scan.nextLine();
		
		//int형으로 형 변환
		int pass = Integer.parseInt(PW);
		
		//중첩질의를 사용하여 로그인 성공과 비밀번호 다름, 아이디 없음
		if(ID.equals(id)) {
			if(pw==pass) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		/*/ 논리 연산자
		if(ID.equals(id) && pw==pass) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		*/
	}

}
