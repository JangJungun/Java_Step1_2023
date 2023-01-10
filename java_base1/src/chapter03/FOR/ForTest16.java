package chapter03.FOR;

public class ForTest16 {

	public static void main(String[] args) {
		int i,j;
		
		for(i=2; i<=9; i++) {
			System.out.print("["+i+"단"+"]"+"\t");
		}//for
		for(i=1; i<=9; i++) {
			System.out.println();
			for(j=2; j<=9; j++) { //i=1|j=2,3,4,5,6,7,8,9
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}//in for
		}// out for
	}//main
}//class
