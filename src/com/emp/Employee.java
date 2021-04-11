package com.emp;

public class Employee {
	
	static double is_employee_present = 1;
	static double is_employee_absent = 0;
	
	double empCheck = (int)Math.floor(Math.random() * 10) % 2;
	
	public void empAttendance() {
		if(empCheck == is_employee_present) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}
}
