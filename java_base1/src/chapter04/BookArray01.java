package chapter04;

public class BookArray01 {

	public static void main(String[] args) {
		
		//Book bk = new book(); << 이런애가 5개있는거다
		Book[] bk = new Book[5];
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i]);
		}
	
		
	}

}
