package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		
		FunTest_Overloading obj = new FunTest_Overloading();
		
		obj.getResult(20);
		obj.getResult('A');
		obj.getResult("해피 주말");
		obj.getResult(6 ," 2023");
		
	}

}
