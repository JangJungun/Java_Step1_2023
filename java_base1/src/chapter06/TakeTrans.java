package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 10000);
		
		//버스타기
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		
		//정보확인
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("-----------------------");
		
		Bus bus987 = new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("-------------------------");
		
		//지하철 타기
		Subway subway1 = new Subway("1호선");
		studentTom.takeSubway(subway1);
		
		//정보확인
		studentTom .showInfo();
		subway1.showInfo();
		
	}

}
