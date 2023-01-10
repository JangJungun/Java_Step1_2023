package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		//학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고 
		//총점과 평균을 분석하는 프로젝트
		Scanner scan = new Scanner(System.in);
		int students = 0;
		int[] score = null;
		int max=0;
		int sum=0;
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택> ");
			int num1 = scan.nextInt();
			
			if(num1==1) {
				System.out.println("학생수> ");
				students=scan.nextInt();
				if(students>0) {
					System.out.println();
				}else {
					System.out.println("0보다 큰수를 입력하십시오");
					continue;
				}
			}else if(num1==2) {
				if(students <= 0) {
					System.out.println("학생수를 먼저 입력하십시오");
					continue;
				}
				score = new int[students];
				for(int i=0; i<students; i++) {
					System.out.print("score["+(i+1)+"] : ");
					score[i] = scan.nextInt();
					sum += score[i];
				}
			}else if(num1==3) {
				if(score == null) {
					System.out.println("점수입력을 먼저 하십시오");
					continue;
				}
				for(int i=0; i<students; i++) {
					System.out.println("score["+(i+1)+"] : "+score[i]);
				}
			}else if(num1==4) {
				if(score == null) {
					System.out.println("점수입력을 먼저 하십시오");
					continue;
				}
				
				for(int i=0; i<students; i++){
					if(max<score[i])
						max=score[i];
				}
				String avg = String.format("%.2f", sum/(double)students);
				System.out.println("최고 점수: "+max);
				System.out.println("총점: "+sum);
				System.out.println("평균: "+avg);
			}else if(num1==5) {
				break;
			}else {
				System.out.println("번호를 잘못 입력하셨습니다.");
				continue;
			}
		}//while
		System.out.println("프로그램 종료");
	}//main
}
