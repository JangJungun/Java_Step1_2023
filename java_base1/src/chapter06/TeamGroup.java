package chapter06;

public class TeamGroup {
	
	//멤버변수(배열->팀구성원)
	private TeamMember member[]  =  new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메서드
	public void init() {
		member[0] = new TeamMember("박창훈", "남");
		member[1] = new TeamMember("이석진", "남");
		member[2] = new TeamMember("박찬우", "남");
		member[3] = new TeamMember("이세정", "여");
		member[4] = new TeamMember("장준근", "남");
		member[5] = new TeamMember("한성무", "남");
	}
	
	//출력 메서드
	public void Disp() {
		for(int i=0; i<member.length; i++) {
			System.out.println("성명 : "+member[i].getName()+", 성별 : "+member[i].getGender());
			
		}
	}
	
	
	
}
