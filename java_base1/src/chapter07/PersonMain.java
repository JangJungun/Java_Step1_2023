package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		Person personKim = new Person();
		System.out.println(personKim.name="김유신");
		System.out.println(personKim.height=180f);
		System.out.println(personKim.weight=80f);
		
		System.out.println("-------------------");
		Person personKang = new Person();
		System.out.println(personKang.name="강감찬");
		System.out.println(personKang.height=175f);
		System.out.println(personKang.weight=75f);
		
		System.out.println("-------------------");
		Person personLee = new Person();
		System.out.println(personLee.name="이순신");
		System.out.println(personLee.height=170f);
		System.out.println(personLee.weight=70f);
	}

}
