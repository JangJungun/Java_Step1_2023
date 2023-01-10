package chapter05;

public class FunTest04 {
	
	public static void Disp(String A[]) {
		String res="";
		
		for(int i=0; i<A.length; i++) {
			res += A[i]+" ";
		}
		System.out.println(res);
		
	}
	
	
	
	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
		
		Disp(str);
		
		
	}

}
