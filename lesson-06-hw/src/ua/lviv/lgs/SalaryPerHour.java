package ua.lviv.lgs;

public class SalaryPerHour implements Salary{
	
	int hour_rate;
	
	public SalaryPerHour(int hour_rate) {
		this.hour_rate=hour_rate;
	}
	
	public int getSalary(int number_of_hours) {
		return hour_rate * number_of_hours;
	}
	
	
}
