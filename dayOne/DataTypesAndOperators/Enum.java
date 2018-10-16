package dayOne.DataTypesAndOperators;

public class Enum {

	public static void main(String[] arg) {
		
		Color c1 = Color.GREEN;
		System.out.println(c1);
		
		//Create test class with enum class and assign week days and print them in console output.
		Weekday day1 = Weekday.MONDAY;
		Weekday day2 = Weekday.TUESDAY;
		Weekday day3 = Weekday.WEDNESDAY;
		Weekday day4 = Weekday.THURSDAY;
		Weekday day5 = Weekday.FRIDAY;
		Weekday day6 = Weekday.SATURDAY;
		Weekday day7 = Weekday.SUNDAY;
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
		System.out.println(day6);
		System.out.println(day7);
	}
	
}
enum Color{
	RED, GREEN, BLUE;
}

enum Weekday {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}