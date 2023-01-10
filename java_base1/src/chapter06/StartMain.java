package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		//객체생성
		Scanner scan = new Scanner(System.in);
		Start st = new Start();
		//방법1
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			select = scan.nextInt();
			check = st.check(select);
			
			if(check.equals("SUCCESS"))
				break;
		}//while
		
		/*
		//방법2
		Start obj = new Start();
		int num;
		
		do {
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();
		}while(obj.check(num).equals("FAIL"));
			
		*/
		
		
		
	}

}
