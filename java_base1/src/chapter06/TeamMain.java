package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember t=new TeamMember();
		//메서드를 통해서 팀명을 초기화
		
		t.setTeamName("7전8D");
		System.out.println("팀명 : "+t.getTeamName());
		System.out.println("====[팀원 명단]====");
		team.init();
		team.Disp();
		
		System.out.println();
		t.setmName("박창훈");
		t.setMphone("010-9186-0744");
		t.setsName("이석진");
		System.out.println("팀장 : "+t.getmName()+", 팀장 전화번호 : "+t.getMphone());
		System.out.println("부팀장 : "+ t.getsName());
		
	}

}
