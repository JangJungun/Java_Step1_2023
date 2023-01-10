package chapter03.FOR;

public class ForTest02 {

	public static void main(String[] args) {
		System.out.println("1부터 100까지의 합을 출력");
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
			sum += i;
		}
		System.out.println();
		System.out.println("1부터 100까지의 합 : "+sum+"입니다.");
		
		
		
	}

}
