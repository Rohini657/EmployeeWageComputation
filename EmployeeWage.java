package com.Employee;

public class EmployeeWageComputation 
{
	public static void main(String args[])
	{
		System.out.println("*********Welcome EmployeeWage Computtaion************");
		final int fullTime=1;
		final int wagePerHour=20;
		final int fullDayHour=8;
		//variable
		int dailyWage;
		int dailyHours;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck == fullTime)
		{
			System.out.println("Employee is Present");
			dailyHours=fullDayHour;
		}
		else
		{
			System.out.println("Employee is Absent");
			dailyHours=0;
		}
	}
}
