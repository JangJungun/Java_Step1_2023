package chapter03.IF;

import java.util.Scanner;

public class IfExample12 {

	public static void main(String[] args) {
		//데이터 베이스
		String ID = "soldesk";
		int PW = 221227;
		
		//Scanner scan
		Scanner scan = new Scanner(System.in);
		
		//ID 받기
		System.out.println("아이디 입력");
		String inputID = scan.nextLine();
		
		if(ID.equals(inputID)) {
			//비번입력 받고
			System.out.println("비밀번호 입력");
			String inputPW = scan.nextLine();
			int pass = Integer.parseInt(inputPW);
			//비번확인 코드
			if(PW==pass) { //if(PW == Integer.parseInt(inputPW)) 여기서 형변환 가능
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
	}

}
