
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DayOfWeeks[] days = DayOfWeeks.values();

		for(DayOfWeeks day : days) {
		    System.out.println(day.day_number + "-ой день недели - " + day.name);
		}
		
		DayOfWeeks sunday = DayOfWeeks.valueOf("Saturday");
		DayFactoryc day = new DayFactoryc(sunday);
		System.out.println(sunday.name +" - " + day.DayFactoryc(sunday.name)); 

		DayFactoryc d = new DayFactoryc();
		System.out.println(d.DayFactoryc("Понедельник")); 

		
	}
}


enum DayOfWeeks{
	Monday("Понедельник", 1), Tuesday("Вторник", 2), Wednesday("Среда", 3), Thursday("Четверг", 4), Friday("Пятница", 5), Saturday("Суббота", 6), Sunday("Воскресение", 7);
	
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
		case "Понедельник": 
			text = days.Monday;
			break;
		case "Вторник": 
			text = days.Friday; 
			break;
		case "Среда": 
			text = days.Wednesday; 
			break;
		case "Четверг": 
			text = days.Thursday; 
			break;
		case "Пятница": 
			text = days.Friday; 
			break;
		case "Суббота": 
			text = days.Saturday; 
			break;
		case "Восскресение": 
			text = days.Sunday; 
			break;
		}
		return text;
	}
}


