package com.emp;

public class Employee {
	
	static double is_employee_full_time = 2;
	static double is_employee_part_time = 1;
	static double is_employee_absent = 0;
	static int wage_per_hours = 20;
	static int hours;
	
	
	int empCheck = (int)Math.floor(Math.random() * 10) % 3;
	
	public void empAttendance() {
		switch (empCheck) {
			case 2 :
				System.out.println("Employee is full time");
				hours = 8;
				break;
			case 1 :
				System.out.println("employee is part time");
				hours = 4;
				break;
		
			default :
				System.out.println("Employee is absent");
				hours = 0;
		}
	}
	
	public void dailyWage() {
		double daily_wage = wage_per_hours * hours;
		System.out.println("Daily wage="+daily_wage);
	}
	
	public void monthlyWage() {
		int working_days=20;
		double monthly_wage = wage_per_hours * (hours * working_days);
		System.out.println("Monthly wage="+monthly_wage);
	}
	
	
}
