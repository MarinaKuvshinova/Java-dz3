
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DayOfWeeks[] days = DayOfWeeks.values();

		for(DayOfWeeks day : days) {
		    System.out.println(day.day_number + "-�� ���� ������ - " + day.name);
		}
		
		DayOfWeeks sunday = DayOfWeeks.valueOf("Saturday");
		DayFactoryc day = new DayFactoryc(sunday);
		System.out.println(sunday.name +" - " + day.DayFactoryc(sunday.name)); 

		DayFactoryc d = new DayFactoryc();
		System.out.println(d.DayFactoryc("�����������")); 

		
	}
}


enum DayOfWeeks{
	Monday("�����������", 1), Tuesday("�������", 2), Wednesday("�����", 3), Thursday("�������", 4), Friday("�������", 5), Saturday("�������", 6), Sunday("�����������", 7);
	
	String name;
	int day_number;
	DayOfWeeks(String name, int day_number) {
		this.name = name;
		this.day_number = day_number;
	}
	
	public String getName() {
		return name;
	}
	public int getDay_number() {
		return day_number;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setDay_number(int day_number) {
//		this.day_number = day_number;
//	}
	
}

class DayFactoryc{
	DayOfWeeks days;
	
	public DayFactoryc() {}
	public DayFactoryc(DayOfWeeks days) {
		this.days = days;
	}

	public DayOfWeeks DayFactoryc(String name){
		DayOfWeeks text = null;
		switch(name) {
		case "�����������": 
			text = days.Monday;
			break;
		case "�������": 
			text = days.Friday; 
			break;
		case "�����": 
			text = days.Wednesday; 
			break;
		case "�������": 
			text = days.Thursday; 
			break;
		case "�������": 
			text = days.Friday; 
			break;
		case "�������": 
			text = days.Saturday; 
			break;
		case "������������": 
			text = days.Sunday; 
			break;
		}
		return text;
	}
}


