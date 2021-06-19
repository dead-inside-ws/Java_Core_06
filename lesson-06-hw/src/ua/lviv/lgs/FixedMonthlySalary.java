package ua.lviv.lgs;

public class FixedMonthlySalary {
	int monthly_rate;
	
	public FixedMonthlySalary(int monthly_rate) {
		this.monthly_rate=monthly_rate;
	}
	
	public int getSalary(int bonus) {
		return monthly_rate+bonus;
	}
}
