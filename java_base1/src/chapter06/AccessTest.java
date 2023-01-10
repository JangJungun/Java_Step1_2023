package chapter06;

import javax.swing.JOptionPane;

public class AccessTest {

	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴드 생성자
	public AccessTest() {
		
	}
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa값 : "+aa+"\nbb값 : " +bb+"\ncc값 : "+cc);
	}
	
	
	public static void main(String[] args) {
		// 객제(obj)
		AccessTest obj = new AccessTest();
		obj.setAa(1);
		//obj.aa=1;
		obj.setBb(2);
		//obj.bb=2;
		obj.setCc(3);
		obj.Disp();
		
		
	}

	

}
