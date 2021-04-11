package com.emp;

public class Employee {
	
	static double is_employee_full_time = 2;
	static double is_employee_part_time = 1;
	static double is_employee_absent = 0;
	static int wage_per_hours = 20;
	static int hours;
	
	double empCheck = (int)Math.floor(Math.random() * 10) % 3;
	
	public void empAttendance() {
		if(empCheck == is_employee_full_time) {
			System.out.println("Employee is full time");
			hours = 8;
		}else if(empCheck ==  is_employee_part_time) {
			System.out.println("employee is part time");
			hours = 4;
		}
		else {
			System.out.println("Employee is absent");
			hours = 0;
		}
	}
	
	public void dailyWage() {
		double daily_wage = wage_per_hours * hours;
		System.out.println(daily_wage);
	}
}
