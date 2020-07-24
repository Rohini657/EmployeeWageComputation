package com.Employee;

public class EmployeeWageComputation 
{
	public static void main(String args[])
	{
		System.out.println("*********Welcome EmployeeWage Computtaion************");
		final int fullTime=1;
		final int partTime=2;
		final int wagePerHour=20;
		final int fullDayHour=8;
		//variable
		int dailyWage;
		int dailyHours;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck == fullTime)
		{
			dailyHours=fullDayHour;
		}
		else if(empCheck==partTime)
		{
			dailyHours=0;
		}
		else
		{
			dailyHours=fullDayHour/2;
		}
		dailyWage=wagePerHour*dailyHour;
		System.out.println("Employee DailyWage= "+dailyWage);
	}
}
