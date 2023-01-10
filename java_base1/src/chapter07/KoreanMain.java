package chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바","010-2365-5698");
		System.out.println("nation : "+k1.nation);
		System.out.println("name : "+k1.name);
		System.out.println("ssn : "+k1.ssn);
		
		Korean k2 = new Korean("김자바","010-1111-5698");
		System.out.println("nation : "+k2.nation);
		System.out.println("name : "+k2.name);
		System.out.println("ssn : "+k2.ssn);
	}

}
