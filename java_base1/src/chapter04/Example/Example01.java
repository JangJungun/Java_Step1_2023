package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
		//for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		
		int[][] array= { {95,86}, {83,92,96}, {78,83,93,87,88} };
		/*
		for(int i=0; i<array.length; i++) {
			int sum=0, count=0;
			for(int j=0; j<array[i].length; j++){
				sum+=array[i][j];
				count++;
			}
			double avg=sum/(double)count;
			System.out.println(i+"행의 합: "+sum);
			System.out.println(i+"행의 평균: "+avg);
			System.out.println("=====================");
		}//for
		
		//방법2
		int total = 0; int count=0; int alltotal=0;
		double avg;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				total += array[i][j];
				count++;//각행의 데이터 수가 누적되어 전체 데이터 수를 받아옴
			}
			avg=total/(double)(array[i].length);
			System.out.println("각 행의 합: "+total);
			System.out.println("각 행의 평균: "+Math.round(avg));
			System.out.println("--------------------------");
			//쓰레기값 초기화
			alltotal+=total;
			total=0; avg=0;
		}
		//전체평균
		double allavg=alltotal/(double)count;
		System.out.println("전체 총합 : "+alltotal);
		System.out.println(String.format("전체 평균 : %.2f",allavg));
	*/
		//방법3
		int total=0, count=0;
		for(int[] num :array ) { //95, 86 
			for(int score : num){//95, 86
				total+=score;
			}//in for
			count++;
			System.out.println(count+"번째줄 학생의 합계 : "+total);
			total=0; //초기화
		}// out for
		
		
		
		
	}//main
}
