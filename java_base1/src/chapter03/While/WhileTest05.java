package chapter03.While;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		//0을 입력하면 프로그램 종료
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			
			num = scan.nextInt();
			
			if(num == 0) {
				break;
			}else {
				sum += num;
				cnt++;
			}
			avg = sum/(double)cnt;
			System.out.println("입력한 자료 수: "+cnt+" / 합계: "+sum+" / 평균: "+avg);
		}//while
		System.out.println("프로그램 종료");
	}//main
}
