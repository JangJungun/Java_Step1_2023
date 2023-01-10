package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		//몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력 받아
		//총점과 평균을 구하시오(단, 평균은 실수로 출력할 것)
		
		Scanner scan = new Scanner(System.in);
		int i, sum=0, cnt=0;
		double avg;
		
		System.out.println("몇 명의 학생 점수를 입력 받으시겠습니까? : ");
		int stu = scan.nextInt();
		
		System.out.println("학생들 점수를 입력하세요: ");
		for(i=1; i<=stu; i++) {
			//System.out.println(i+"번째 학생의 점수를 입력하세요");도 가능
			int score = scan.nextInt();
			sum += score; //sum+= scan.nextInt(); 한줄로 줄일수있다
			cnt++;//인원수 누적
		}
		//평균
		avg = sum/(double)cnt;
		System.out.println("학생 "+cnt+"명의 총점은 "+sum+"점 이고 평균은 "+avg+"점 입니다.");
		
	}

}



