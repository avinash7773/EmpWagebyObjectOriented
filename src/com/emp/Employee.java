package com.emp;

public class Employee {
	
	static int wage_per_hours = 20;
	static int total_hours = 0 ;
	static  int working_days=0;
	static int daily_hours=8;
	double daily_wage;
	
	
	
	
	
	public void empAttendance() {
		
		final int is_employee_full_time = 2;
		final int is_employee_part_time = 1;
		int days = 0;
		int hours=0;
		while(total_hours <= 100 && days <=20) {
			int empCheck = (int) Math.floor(Math.random() *10) % 3;
				switch (empCheck) {
					case is_employee_full_time :
						hours = 8;
						days++;
						break;
					case is_employee_part_time :
						hours = 4;
						days++;
						break;
		
					default :
						hours = 0;
						break;
				}
		total_hours = total_hours + hours;
		working_days = working_days + days;
		}
	}
	
	public void dailyWage() {
		daily_wage = wage_per_hours * daily_hours;
		System.out.println("Daily wage="+daily_wage);
	}
	
	public void monthlyWage() {
		double monthly_wage = daily_wage  * working_days;
		System.out.println("Monthly wage="+monthly_wage);
	}
	
	
}
