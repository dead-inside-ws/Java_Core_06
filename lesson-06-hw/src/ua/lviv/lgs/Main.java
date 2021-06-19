package ua.lviv.lgs;

public class Main {
	
	public static void main(String[] args) {
		
		SalaryPerHour sph = new SalaryPerHour(30);
		System.out.println("Погодинна зарплатня працівника = "+sph.getSalary(5)+" USD");
		System.out.println();
		FixedMonthlySalary fms = new FixedMonthlySalary(1800);
		System.out.println("Місячна зарплатня працівника = "+fms.getSalary(135)+" USD");
//		SalaryPerMonth spm = new SalaryPerMonth(0)
	}
	
}
