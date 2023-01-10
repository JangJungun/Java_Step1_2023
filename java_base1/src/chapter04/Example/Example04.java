package chapter04.Example;

import javax.swing.JOptionPane;

public class Example04 {

	public static void main(String[] args) {
		// 로또번호 6개를 담을 배열
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		//중복없이 1~45 6개 숫자
		System.out.println("==== 이번주 로또 예상번호 ====");
		number=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
		
		while(number>cnt) {
			System.out.print("["+(cnt+1)+"] : ");	
		outer: for(int i=0; i<lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
					}
						
				}
				
				
			}
			cnt++;
			
			
			for(int i=0; i<lotto.length; i++) {
				System.out.print(lotto[i]+" ");
			}
			System.out.println();
			
			
		}//while
		
		
		
	}

}
