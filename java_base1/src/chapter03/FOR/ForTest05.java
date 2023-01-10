package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		//문제1 정수를 입력받아 입력받은 정수부터 100까지의 합
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("100이하의 정수를 입력하세요: ");
		int i= scan.nextInt();
		int sum=0;
		for(int j=i; j<=100; j++ ) {
			sum+=j;
		}
		System.out.println(i+"부터 100까지의 합: "+sum);
			
		//문제2 1부터 10까지 반복하면서 정수를 입력받아 
		//그 수중에 짝수의 갯수가 몇개인지 출력
		//단 입력받은 수가 0이면 무시
		
		System.out.println("1~10까지의 정수를 입력하세요: ");
		
		int a = scan.nextInt();
		int even=0;
		for(int b=0; b<=a; b++) {
			if(a<1 || a>10) {
				System.out.println("1부터 10까지의 정수를 입력하세요!");
				break;
			}
			
			else if(b != 0 && b % 2 == 0) {
				even++;
			}
		}
		if(a>=1 && a<=10) {
			System.out.println("1부터 "+a+"까지 짝수의 개수는 "+ even + "개 입니다.");
			
		}
		else if(a<0) {
			System.out.println("1부터 10까지의 정수를 입력하세요!");
		}
		//2번문제 선생님 풀이
		System.out.println("정수를 입력하세요 : ");
		int b, j, cnt=0;
		
		for(j=1; j<=10; j++) {
			b=scan.nextInt();
			if(b==0) {
				continue;
			}
			
			if(b%2 == 0) {
				cnt++;
			}
		}
		System.out.println("입력받은 수의 짝수의 개수 : "+ cnt);
		
		
		
		
	}

}
